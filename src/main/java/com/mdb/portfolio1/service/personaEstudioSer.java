
package com.mdb.portfolio1.service;

import com.mdb.portfolio1.dto.personaEstudioInter;
import com.mdb.portfolio1.entity.personaEstudio;
import com.mdb.portfolio1.repository.personaEstudioRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personaEstudioSer implements  personaEstudioInter{

    @Autowired
    private personaEstudioRepo EstudioRepo;
            
    @Override
    public List<personaEstudio> gEstudios() {
    return EstudioRepo.findAll();
    }

    @Override
    public personaEstudio gEstudioId(int id) {
            return EstudioRepo.findOne(id);
    }

    @Override
    public personaEstudio edit(personaEstudio p) {
        return EstudioRepo.save(p);
    }

    @Override
    public personaEstudio add(personaEstudio p) {
       return EstudioRepo.save(p);
    }

    @Override
    public personaEstudio delete(int id) {
        personaEstudio p=EstudioRepo.findOne(id);
        if (p!=null){
      EstudioRepo.delete(p);
    }
        return p;
        
    }

    public void delete() {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. 
    }

    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public personaEstudio findAll(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
