package com.usc.crud.model;

import javax.persistence.*;

@Entity
@Table(name="empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    private String nombreCompleto;

    private String celular;

    private String confirmacionPassword;

    private String password;

    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return nombre;
    }

    public void setUser(String user) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreCompleto(){return nombreCompleto;}

    public void setNombreCompleto(String nombreCompleto){this.nombreCompleto= nombreCompleto;}

    public String getCelular(){return celular;}

    public void setCelular(String celular){this.celular=celular;}

    public String getConfirmacionPassword(){return confirmacionPassword;}

    public void setConfirmacionPassword(String confirmacionPassword){this.confirmacionPassword=confirmacionPassword;}
}
