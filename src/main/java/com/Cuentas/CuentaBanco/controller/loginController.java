package com.Cuentas.CuentaBanco.controller;


import com.Cuentas.CuentaBanco.model.Ahorros;
import com.Cuentas.CuentaBanco.model.Login;
import com.Cuentas.CuentaBanco.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
@RequiredArgsConstructor
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

     @GetMapping("/login/name/{nombre}")
    public ResponseEntity<?> getBynombre(@PathVariable String nombre) {
        String nombres = "";
        List<Login> login = this.loginService.getBynombre(nombre);
        for (Login logi : login) {
            nombres = logi.getNombre();
            
        }
        if (!nombre.equals(nombres)) {

        }
        return ResponseEntity.ok(login);
    }	
    @GetMapping("login/vali/{nombre}")
    public boolean getBynombreVali(@PathVariable String nombre, String passw) {
        String nombres = "";
        passw = "123"; //parametro que mandas del frontend
        String pass = "";
        List<Login> login = this.loginService.getBynombre(nombre);
        pass = login.get(0).getPass();
        for (Login logi : login) {
            nombres = logi.getNombre();
           // pass = ahorro.getCedula();
        }
        if (nombre.equals(nombres)&& passw.equals(pass)) {
                    return true;
        }
        return false;
    }	


}