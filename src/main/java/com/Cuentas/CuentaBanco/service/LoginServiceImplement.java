package com.Cuentas.CuentaBanco.service;

import com.Cuentas.CuentaBanco.DAO.LoginDAO;
import java.util.List;
import com.Cuentas.CuentaBanco.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginServiceImplement implements LoginService {
    @Autowired
    private LoginDAO loginDao;


    @Override
    @Transactional(readOnly=true)
    public List<Login> findAll()
    {
        return (List<Login>) loginDao.findAll();
    }


    @Override
    @Transactional(readOnly=true)
    public Login findById(Integer id)
    {
        return loginDao.findById(id).orElse(null);
    }




}
