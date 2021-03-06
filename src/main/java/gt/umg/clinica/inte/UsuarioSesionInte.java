/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.inte;

import gt.umg.clinica.entities.UsuarioSesion;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author steven
 */
@RestController()
@RequestMapping(value="/api/UsuarioSesion", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public interface UsuarioSesionInte {
    
    @Transactional(readOnly = true)
    @RequestMapping(value = "/isSessionValid", method = RequestMethod.GET)
    public ResponseEntity<Boolean> isSessionValid(
            @RequestParam(value = "token", defaultValue = "") String token,
            @RequestParam(value = "userId", defaultValue = "0") Integer userId
    ) throws Exception;
    
    @Transactional()
    public ResponseEntity logout(
            @RequestParam(value = "token", defaultValue = "") String token,
            @RequestParam(value = "userId", defaultValue = "0") Integer userId
    ) throws Exception;
    
    @Transactional()
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResponseEntity<UsuarioSesion> login(
            @RequestParam(value = "usuario", defaultValue = "") String usuario,
            @RequestParam(value = "pass", defaultValue = "") String pass
    ) throws Exception;
    
}
