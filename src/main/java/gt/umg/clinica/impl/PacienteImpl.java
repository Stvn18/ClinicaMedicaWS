package gt.umg.clinica.impl;

import gt.umg.clinica.entities.Clinica;
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

    @Override
    public ResponseEntity<Paciente> onCreate(Paciente paciente) throws Exception {
        /*
        if ("".equals(paciente.getNombre()) || paciente.getNombre() == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        if ("".equals(paciente.getApellido()) || paciente.getApellido() == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        if (paciente.getEdad() == 0 || paciente.getEdad() == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        if ("".equals(paciente.getTelefono()) || paciente.getTelefono() == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        if ("".equals(paciente.getIgss()) || paciente.getIgss() == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
        String pacienteNombre = pacienteRepo.findByNombre(paciente.getNombre());
         
         if(!"".equals(pacienteNombre)){
             return new ResponseEntity(HttpStatus.FOUND);
         }else{
             paciente.setClinica(new Clinica(1));
             
             pacienteRepo.save(paciente);
             return new ResponseEntity(paciente,HttpStatus.OK);
         }*/

        paciente.setClinica(paciente.getClinica());

        pacienteRepo.save(paciente);
        return new ResponseEntity(paciente, HttpStatus.OK);

    }

}
