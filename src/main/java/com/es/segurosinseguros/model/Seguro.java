package com.es.segurosinseguros.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "seguros")
public class Seguro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_seguro")
    private Long idSeguro;
    private String nif;
    private String nombre;
    private String ape1;
    private String ape2;
    private int edad;

    @Column(name = "num_hijos")
    private int numHijos;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;
    private String sexo;
    private boolean casado;
    private boolean embarazada;

    public Seguro() {
    }

    public Seguro(String nif, String nombre, String ape1, String ape2, int edad, int numHijos, Date fechaCreacion, String sexo, boolean casado, boolean embarazada) {
        this.nif = nif;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.edad = edad;
        this.numHijos = numHijos;
        this.fechaCreacion = fechaCreacion;
        this.sexo = sexo;
        this.casado = casado;
        this.embarazada = embarazada;
    }

    public Seguro(Long idSeguro, String nif, String nombre, String ape1, String ape2, int edad, int numHijos, Date fechaCreacion, String sexo, boolean casado, boolean embarazada) {
        this.idSeguro = idSeguro;
        this.nif = nif;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.edad = edad;
        this.numHijos = numHijos;
        this.fechaCreacion = fechaCreacion;
        this.sexo = sexo;
        this.casado = casado;
        this.embarazada = embarazada;
    }

    public Long getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(Long idSeguro) {
        this.idSeguro = idSeguro;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public boolean isEmbarazada() {
        return embarazada;
    }

    public void setEmbarazada(boolean embarazada) {
        this.embarazada = embarazada;
    }
}
