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
        Ahorros ahorross = new Ahorros();
        AhorrosServiceImplement ahorros = new AhorrosServiceImplement();
        
        ahorros.findById(1);
        ahorross=ahorros.findById(1);
        
         AhorrosService ahorrosService = mock(AhorrosService.class);
            when(ahorrosService.findAll()).thenReturn(Arrays.asList(ahorross));
            assertNotNull(ahorrosService.findAll());

    }

}
