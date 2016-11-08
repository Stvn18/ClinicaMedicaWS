package gt.umg.clinica.impl;

import gt.umg.clinica.entities.Paciente;
import gt.umg.clinica.inte.PacienteInte;
import gt.umg.clinica.repo.PacienteRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component()
public class PacienteImpl implements PacienteInte {
    
    @Autowired()
    private PacienteRepo pacienteRepo;
    
    @Override
    public ResponseEntity<Paciente> findAll() throws Exception {
        
        List<Paciente> pacientes = pacienteRepo.findAll();
        
        return new ResponseEntity(pacientes, HttpStatus.OK);
    }
    
}