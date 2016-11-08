package gt.umg.clinica.impl;

import gt.umg.clinica.entities.Cita;
import gt.umg.clinica.inte.CitaInte;
import gt.umg.clinica.repo.CitaRepo;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component()
public class CitaImpl implements CitaInte {

    @Autowired()
    private CitaRepo citaRepo;
    
    @Override
    public ResponseEntity<Cita> onCreate(Cita cita) throws Exception {
        
        
        cita.getAsignaciones().get(0).setFecha(new Date());
        
        citaRepo.save(cita);
        
        
        return new ResponseEntity(HttpStatus.OK);
    }

}
