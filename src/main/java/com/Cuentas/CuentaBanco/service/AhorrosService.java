/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Cuentas.CuentaBanco.service;

import com.Cuentas.CuentaBanco.model.Ahorros;
import java.util.List;

/**
 *
 * @author mota1
 */
public interface AhorrosService {
    public List<Ahorros> findAll();
    public Ahorros save(Ahorros ahorros);
    public Ahorros findById(Integer id);
    public void delete(Integer id);
    
}
