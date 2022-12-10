/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cuentas.CuentaBanco.controller;

/**
 *
 * @author mota1
 */

import java.net.URI;
import java.util.List;
import java.util.Optional;
import com.Cuentas.CuentaBanco.model.Ahorros;
import com.Cuentas.CuentaBanco.service.AhorrosService;

import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.springDataCuentas.CuentasJPA.service.AhorrosService;


@RestController
@CrossOrigin(origins="*")
@RequestMapping ("/api/")
public class ahorrosController {
	
	@Autowired
	public AhorrosService ahorrosService;
	
        
        //Guardar
	@PostMapping("/ahorros")
	public Ahorros guardar (@RequestBody Ahorros ahorros){
		
		return ahorrosService.save(ahorros);                       	
	}
	
	//listar
	@GetMapping("/ahorros")
	public List<Ahorros> listar(){
		return ahorrosService.findAll();
	}
	
	@DeleteMapping ("/ahorros/{id}")
	public void eliminar(@PathVariable Integer id){
		ahorrosService.delete(id);
	}
	
        //get una cuenta
	@GetMapping ("/ahorros/{id}")
	public Ahorros getUnaAhorros(@PathVariable Integer id){
		return ahorrosService.findById(id);
	}
	
        @PutMapping ("/ahorros/{id}")
	public Ahorros modificar (@RequestBody Ahorros ahorros, @PathVariable Integer id){
		
                Ahorros ahorrosActual = ahorrosService.findById(id);
                ahorrosActual.setNumCuenta(ahorros.getNumCuenta());
                ahorrosActual.setCedula(ahorros.getCedula());
                ahorrosActual.setInteres(ahorros.getInteres());
                ahorrosActual.setNombre(ahorros.getNombre());
                ahorrosActual.setSaldoInicial(ahorros.getSaldoInicial());
   
                return ahorrosService.save(ahorrosActual);
	}
}