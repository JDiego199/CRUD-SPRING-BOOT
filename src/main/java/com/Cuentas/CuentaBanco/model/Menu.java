package com.Cuentas.CuentaBanco.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fabricio
 */
public class Menu {

    public Menu() {
    }
    
    
    
   public String getOption(int optionNumber) {
    switch (optionNumber) {
      case 1:
        return "Opción 1";
      case 2:
        return "Opción 2";
      default:
        return "Opción inválida";
    }
  
    
}
   }
