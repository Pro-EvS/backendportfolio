
package com.mdb.portfolio1.controller;

import com.mdb.portfolio1.entity.personaEntity;
import com.mdb.portfolio1.service.personaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = {"https://portfolio-evelyn.web.app"})
public class personaController {
    
    @Autowired
    personaService service;
    
    @GetMapping("/sobre-mipersona/traer")
    //ver
    private List<personaEntity> getPersona(){
        return service.getPersona();
    }
    
    @PostMapping("/sobre-mipersona/newPersona")
    //crear
    public String createPersona(@RequestBody personaEntity p){
        service.add(p);
         return "Su cuenta ah sido Creada con exito";
    }
    
    @DeleteMapping("sobre-mipersona{id}/borrar/{id}")
    //borrar Persona
    public String deletePersona(@PathVariable personaEntity p){
        service.delete();
        return "La Cuenta a sido borrada con exito";
    }
    
    @PutMapping("/personas/sobre-mipersona/editar/{id})")
    //editar Persona
    public personaEntity editpEntity(@PathVariable int id,
            @RequestParam("nombre")String nuevoNombre,
            @RequestParam("apellido")String nuevoApellido){
        personaEntity perEntity= service.findAll(id);
            perEntity.setnombre(nuevoNombre);
            perEntity.setapellido(nuevoApellido);
            service.add(perEntity);
            return perEntity;
    }
    
}
