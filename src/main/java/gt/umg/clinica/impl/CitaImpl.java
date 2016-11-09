package gt.umg.clinica.impl;

import gt.umg.clinica.entities.Cita;
import gt.umg.clinica.inte.CitaInte;
import gt.umg.clinica.repo.CitaRepo;
import gt.umg.clinica.security.Session;
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
          
        if (cita == null){
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }

        if ("".equals(cita.getDescripcion())||cita.getDescripcion() == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        if ("".equals(cita.getEstado())||cita.getEstado()== null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        if ("".equals(cita.getHorario())||cita.getHorario()==null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        cita.getAsignaciones().get(0).setFecha(new Date());

        citaRepo.save(cita);

        return new ResponseEntity(cita,HttpStatus.OK);
    }

}
