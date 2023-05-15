
package com.mdb.portfolio1.dto;

import com.mdb.portfolio1.entity.personaEstudio;
import java.util.List;


public interface personaEstudioInter {
    
    List<personaEstudio> gEstudios();
    personaEstudio gEstudioId(int id);
     personaEstudio edit(personaEstudio p);
   personaEstudio add(personaEstudio p);
   personaEstudio delete(int id);
}
