/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.Cuentas.CuentaBanco;
import com.Cuentas.CuentaBanco.model.Ahorros;
import com.Cuentas.CuentaBanco.service.AhorrosServiceImplement;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
/**
 *
 * @author fabricio
 */
public class CuentaBancoApplicationTestsEliminar {
    
  @Test
    public void TestModificacion() {
        AhorrosServiceImplement ahorros = new AhorrosServiceImplement();
        
     
        ahorros.findById(1);
        ahorros.delete(1);
 
        assertNull(ahorros.findById(1));
        
        
        

    }
    
    
}
