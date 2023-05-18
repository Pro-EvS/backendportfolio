
package com.mdb.portfolio1.entity;


import javax.persistence.Id;


public class personaEstudio extends personaEntity {
    @Id
    private Long Id;
    private String estudios;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public personaEstudio() {
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }
    
    
}
