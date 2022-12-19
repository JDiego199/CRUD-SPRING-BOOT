package com.Cuentas.CuentaBanco.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (name = "login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name ="usuario", nullable = false)
    private String usuario;
    @Column(name ="pass", nullable = false)
    private String pass;

}