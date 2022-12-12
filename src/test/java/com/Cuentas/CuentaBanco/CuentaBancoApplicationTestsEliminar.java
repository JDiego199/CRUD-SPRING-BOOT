/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.Cuentas.CuentaBanco;
import com.Cuentas.CuentaBanco.model.Ahorros;
import com.Cuentas.CuentaBanco.service.AhorrosService;
import com.Cuentas.CuentaBanco.service.AhorrosServiceImplement;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 *
 * @author fabricio
 */
public class CuentaBancoApplicationTestsEliminar {
    
  @Test
    public void TestEliminacion() {
        AhorrosServiceImplement ahorros = new AhorrosServiceImplement();
        
     

        
          AhorrosService ahorrosService = mock(AhorrosService.class);
          
          ahorrosService.delete(1);
          
          
         when(ahorrosService.findAll()).thenReturn(Arrays.asList());
           // when(ahorrosService.findById(1));
            assertNull(ahorrosService.findById(1));
        
        
        

    }
    
    
}
