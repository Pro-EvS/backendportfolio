
package com.mdb.portfolio1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Persona")
public class personaEntity{
     @Id
     @Column
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     @Column 
     private String nombre;
     @Column
     private String apellido;
    private String nuevoNombre;
    private String nuevoApellido;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setnombre(String nuevoNombre) {
        this.nuevoNombre = nombre;
    }

    public void setapellido(String nuevoApellido) {
      this.nuevoApellido = apellido;
    }


}