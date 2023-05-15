
package com.mdb.portfolio1.repository;


import com.mdb.portfolio1.entity.personaEstudio;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface personaEstudioRepo extends Repository<personaEstudio, Integer>{
    List<personaEstudio>findAll();
    personaEstudio findOne(int id);
    personaEstudio save(personaEstudio p);
    void add(personaEstudio p);
    void edit(personaEstudio p);
    void delete(personaEstudio p);

    public personaEstudio savePersona(personaEstudio p);

    public void add();
}

