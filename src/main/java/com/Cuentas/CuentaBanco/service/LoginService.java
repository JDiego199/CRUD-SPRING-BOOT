package com.Cuentas.CuentaBanco.service;


import com.Cuentas.CuentaBanco.model.Login;

import java.util.List;

public interface LoginService {
    public List<Login> findAll();
    public Login findById(Integer id);
        List<Login>  getBynombre(String nombre);

}
