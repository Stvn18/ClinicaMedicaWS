package gt.umg.clinica.inte;

import gt.umg.clinica.entities.Cita;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping(value = "/api/Cita", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public interface CitaInte {
    
    @Transactional()
    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST) 
    public ResponseEntity<Cita> onCreate(
            @RequestBody() Cita cita
    ) throws Exception;
    
}