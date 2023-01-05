package com.Cuentas.CuentaBanco.service;


import com.Cuentas.CuentaBanco.Repository.LoginRepository;
import java.util.List;
import com.Cuentas.CuentaBanco.model.Login;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor

public class LoginServiceImplement implements LoginService {
  /*  @Autowired
    private LoginDAO loginDao;
    */
    @Autowired
    private LoginRepository loginRepository;


    @Override
    @Transactional(readOnly=true)
    public List<Login> findAll()
    {
        return (List<Login>) loginRepository.findAll();
    }


    @Override
    @Transactional(readOnly=true)
    public Login findById(Integer id)
    {
        return loginRepository.findById(id).orElse(null);
    }
       @Override
  // @Transactional(readOnly = true)
   public List<Login> getBynombre(String nombre) {
      return this.loginRepository.getBynombre(nombre);
   }
   


}
