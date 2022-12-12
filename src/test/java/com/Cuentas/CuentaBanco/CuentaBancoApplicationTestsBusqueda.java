/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cuentas.CuentaBanco;

import com.Cuentas.CuentaBanco.model.Ahorros;
import com.Cuentas.CuentaBanco.service.AhorrosService;
import com.Cuentas.CuentaBanco.service.AhorrosServiceImplement;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author fabricio
 */
@SpringBootTest
public class CuentaBancoApplicationTestsBusqueda {

    @Test
    public void TestBusqueda() {

        
        
        Ahorros ahorros = new Ahorros();
            ahorros.setNumCuenta("132132");
            ahorros.setNombre("Diego");
            ahorros.setCedula("132326");
           ahorros.setSaldoInicial(123);
            ahorros.setInteres(5);
            
            AhorrosService ahorrosService = mock(AhorrosService.class);
            ahorrosService.save(ahorros);

         when(ahorrosService.findById(1));
                  //   assertNotNull(ahorrosService.findById(1));
           // when(ahorrosService.findById(1));


    }

}
