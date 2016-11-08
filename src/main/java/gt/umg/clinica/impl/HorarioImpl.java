package gt.umg.clinica.impl;

import gt.umg.clinica.entities.Horario;
import gt.umg.clinica.inte.HorarioInte;
import gt.umg.clinica.repo.HorarioRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component()
public class HorarioImpl implements HorarioInte {
    
    @Autowired()
    private HorarioRepo horarioRepo;
    
    @Override
    public ResponseEntity<Horario> findAll() throws Exception {
       
        List<Horario> horarios = horarioRepo.findAll();
        
        return new ResponseEntity(horarios, HttpStatus.OK);
        
    }
    
}