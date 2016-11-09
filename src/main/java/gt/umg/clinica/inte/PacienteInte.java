package gt.umg.clinica.inte;

import gt.umg.clinica.entities.Paciente;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/api/Paciente",produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public interface PacienteInte {
    
    @Transactional(readOnly = true)
    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public ResponseEntity<Paciente> findAll() throws Exception;
    
    @Transactional()
    @RequestMapping(value = {"","/"}, method = RequestMethod.POST)
    public ResponseEntity<Paciente> onCreate(
      @RequestBody() Paciente paciente
    ) throws Exception;
    
}