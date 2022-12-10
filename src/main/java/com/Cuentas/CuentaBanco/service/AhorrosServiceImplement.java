/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cuentas.CuentaBanco.service;

import com.Cuentas.CuentaBanco.DAO.AhorrosDAO;
import com.Cuentas.CuentaBanco.model.Ahorros;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mota1
 */
@Service
public class AhorrosServiceImplement implements AhorrosService {
    
    
    @Autowired
    
    private AhorrosDAO ahorrosDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Ahorros> findAll()
    {
    return (List<Ahorros>) ahorrosDao.findAll();
    }
    
    @Override
       @Transactional(readOnly=false)
    public Ahorros save( Ahorros ahorros){
    
        return ahorrosDao.save(ahorros);
    }
    
    @Override
       @Transactional(readOnly=true)
    public Ahorros findById(Integer id)
    {
        return ahorrosDao.findById(id).orElse(null);
    }
    
    @Override
       @Transactional(readOnly=false)
    public void delete(Integer id)
    {
        ahorrosDao.deleteById(id);
    }
}
