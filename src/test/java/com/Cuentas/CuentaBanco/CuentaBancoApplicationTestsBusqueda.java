/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cuentas.CuentaBanco;

import com.Cuentas.CuentaBanco.model.Ahorros;
import com.Cuentas.CuentaBanco.service.AhorrosService;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author mota1
 */
public class CuentaBancoApplicationTestsBusqueda {
    
      
    @Autowired
    private AhorrosService repo;
    
    @Test
	public void contextLoads() {
            
            Ahorros ahorros = new Ahorros();
           //  ahorros.setId(1);
            ahorros.setNumCuenta("1321352");
            ahorros.setNombre("Diego");
            ahorros.setCedula("132326");
            ahorros.setSaldoInicial(123);
            ahorros.setInteres(5);
            
            AhorrosService ahorrosService = mock(AhorrosService.class);
            
            
            Ahorros cta = repo.findById(1);
                
                // cta = repo.findByNumCuenta("1321352");
                 
               
        
          //  System.out.println(cta.getNumCuenta());
          //  assertThat()
          //  assertNotNull(cta);
            
         //  when(ahorrosService.findAll()).thenReturn(Arrays.asList(ahorros));
        //   assertEquals(repo.findById(3),true);
            
            
            
          //  assertThat()
          //  assertNotNull(cta);
            
         //  when(ahorrosService.findAll()).thenReturn(Arrays.asList(ahorros));
         //  assertEquals(repo.existsById(3),true);
           assertThat(cta.getNumCuenta()).isEqualTo("1321352");
            
        }
        
  /*        @Test
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


    }*/
}
