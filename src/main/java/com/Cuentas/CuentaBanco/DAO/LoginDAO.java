package com.Cuentas.CuentaBanco.DAO;

import com.Cuentas.CuentaBanco.model.Login;
import org.springframework.data.repository.CrudRepository;

public interface LoginDAO extends CrudRepository<Login,Integer> {
}
