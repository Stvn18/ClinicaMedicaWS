package gt.umg.clinica.inte;

import gt.umg.clinica.entities.Trabajador;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/api/Trabajador", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public interface TrabajadorInte {
    
    @Transactional(readOnly = true)
    @RequestMapping(value = "/findByPuesto", method = RequestMethod.GET)
    public ResponseEntity<Trabajador> findByPuesto(
            @RequestParam(value = "puestoId", defaultValue = "0") Integer puestoId
    ) throws Exception;
    
}