/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Cuentas.CuentaBanco.DAO;

import com.Cuentas.CuentaBanco.model.Ahorros;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mota1
 */
public interface AhorrosDAO extends CrudRepository<Ahorros, Integer> {
    
    
}
