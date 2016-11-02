/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.inte;

import gt.umg.clinica.entities.Pantalla;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Steven
 */
@RestController()
@RequestMapping(value = "/api/Pantalla", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public interface PantallaInte {

    @Transactional(readOnly = true)
    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public ResponseEntity<Pantalla> onFindAll(
            @RequestParam(value = "token", defaultValue = "") String token,
            @RequestParam(value = "userId", defaultValue = "0") Integer userId
    ) throws Exception;

}
