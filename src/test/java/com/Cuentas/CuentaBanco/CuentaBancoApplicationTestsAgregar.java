/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cuentas.CuentaBanco;

import com.Cuentas.CuentaBanco.model.Ahorros;
import com.Cuentas.CuentaBanco.service.AhorrosService;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author mota1
 */

@SpringBootTest
public class CuentaBancoApplicationTestsAgregar {
    
    @Autowired
    private AhorrosService repo;
    
    @Test
	public void contextLoads() {
            
            Ahorros ahorros = new Ahorros();
            ahorros.setNumCuenta("132132");
            ahorros.setNombre("Diego");
            ahorros.setCedula("132326");
            ahorros.setSaldoInicial(123);
            ahorros.setInteres(5);
            
            AhorrosService ahorrosService = mock(AhorrosService.class);
            
            Ahorros cta;
            cta = repo.save(ahorros);
            
            assertNotNull(cta);
            
         //   when(ahorrosService.findAll()).thenReturn(Arrays.asList(ahorros));
         //   assertNotNull(ahorrosService.findAll());
            
        }

}
