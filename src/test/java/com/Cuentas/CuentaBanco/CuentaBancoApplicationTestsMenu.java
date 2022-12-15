/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cuentas.CuentaBanco;

import com.Cuentas.CuentaBanco.model.Menu;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author fabricio
 */
public class CuentaBancoApplicationTestsMenu {
    
    
    Menu menu = new Menu();

  // Escribimos un método de prueba para comprobar el comportamiento del menú
  @Test
  public void testGetOption() {

    assertEquals("Opción 1", menu.getOption(1));
    assertEquals("Opción 2", menu.getOption(2));
  }
    
}
