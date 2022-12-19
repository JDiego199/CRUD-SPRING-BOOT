package com.Cuentas.CuentaBanco.controller;


import com.Cuentas.CuentaBanco.model.Login;
import com.Cuentas.CuentaBanco.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class loginController {

    @Autowired
        public LoginService loginService;

    //listar
    @GetMapping("/login")
    public List<Login> listarlogin(){
        return loginService.findAll();
    }

    //get una cuenta
    @GetMapping ("/login/{id}")
    public Login getUnaLogin(@PathVariable Integer id){
        return loginService.findById(id);
    }



}