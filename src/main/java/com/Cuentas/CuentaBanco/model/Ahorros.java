package com.Cuentas.CuentaBanco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (name = "ahorros")
public class Ahorros {

    public Ahorros(String numCuenta, float saldoInicial, String cedula, String nombre, float interes) {

    }
	
    
    
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    @Column(name = "numCuenta", nullable = false)
	private String numCuenta;
    @Column(name = "saldoInicial", nullable = false)
	private float saldoInicial;
    @Column(name = "Cedula", nullable = false)
	private String cedula;
    @Column(name = "Nombre", nullable = false)
	private String nombre;
    @Column(name = "interes", nullable = false)
	private float interes;

    @Override
    public String toString() {
        return "ahorros{" + "id=" + id + ", numCuenta=" + numCuenta + ", saldoInicial=" + saldoInicial + ", cedula=" + cedula + ", nombre=" + nombre + ", interes=" + interes + '}';
    }
	
	
	

}