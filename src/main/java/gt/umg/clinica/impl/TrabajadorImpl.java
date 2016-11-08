package gt.umg.clinica.impl;

import gt.umg.clinica.entities.Puesto;
import gt.umg.clinica.entities.Trabajador;
import gt.umg.clinica.inte.TrabajadorInte;
import gt.umg.clinica.repo.TrabajadorRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component()
public class TrabajadorImpl implements TrabajadorInte {

    @Autowired()
    private TrabajadorRepo trabajadorRepo;
    
    @Override
    public ResponseEntity<Trabajador> findByPuesto(Integer puestoId) throws Exception {
        
        List<Trabajador> trabajadores = trabajadorRepo.findByPuesto(new Puesto(puestoId));
        
        return new ResponseEntity(trabajadores, HttpStatus.OK);
        
    }
    
}