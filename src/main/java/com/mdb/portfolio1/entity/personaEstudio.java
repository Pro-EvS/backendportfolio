
package com.mdb.portfolio1.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
public class personaEstudio{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String educacion;


    public personaEstudio() {
    }

    public String getEstudios() {
        return educacion;
    }

    public void setEstudios(String estudios) {
        this.educacion = estudios;
    }
    
    
}
