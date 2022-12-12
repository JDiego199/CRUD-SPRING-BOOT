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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author fabricio
 */
public class CuentaBancoApplicationTestsModificar {

    @Test
    public void TestModificacion() {

        AhorrosService ahorrosService = mock(AhorrosService.class);

        ahorrosService.delete(1);
        Ahorros ahorros = new Ahorros();
        ahorros.setNumCuenta("132132");
        ahorros.setNombre("Diego");
        ahorros.setCedula("132326");
        ahorros.setSaldoInicial(123);
        ahorros.setInteres(5);

        ahorrosService.delete(1);


        ahorrosService.save(ahorros);

         assertNull(ahorrosService.findById(1));
    

    }
    
}
