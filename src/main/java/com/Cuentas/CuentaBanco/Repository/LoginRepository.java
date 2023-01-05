/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Cuentas.CuentaBanco.Repository;

import com.Cuentas.CuentaBanco.model.Login;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mota1
 */
@Repository
public interface LoginRepository extends JpaRepository<Login,Integer> {
      List<Login> getBynombre (String nombre);
}
