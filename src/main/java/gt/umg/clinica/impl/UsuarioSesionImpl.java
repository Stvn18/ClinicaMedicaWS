/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.impl;

import gt.umg.clinica.entities.Usuario;
import gt.umg.clinica.entities.UsuarioSesion;
import gt.umg.clinica.inte.UsuarioSesionInte;
import gt.umg.clinica.repo.UsuarioRepo;
import gt.umg.clinica.repo.UsuarioSesionRepo;
import gt.umg.clinica.security.Md5Encrypt;
import static java.lang.System.console;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author steven.vargas
 */
@Component()
public class UsuarioSesionImpl implements UsuarioSesionInte{
    
    Logger log = LoggerFactory.getLogger(this.getClass());
    
    @Autowired()
    UsuarioRepo usuarioRepo;

    @Autowired()
    UsuarioSesionRepo usuarioSesionRepo;

    @Override
    public ResponseEntity<UsuarioSesion> login(String usuario, String pass) throws Exception {

        Usuario user = usuarioRepo.findByUsuario(usuario);
        
        if (user == null) {
            /**
             * Usuario no existe
             */
            return new ResponseEntity(HttpStatus.NOT_FOUND);

        }
        
        /**
         * Comparamos los password
         */
        String encryptPassword = Md5Encrypt.get_md5(pass);
        
        if (!user.getPassword().equals(encryptPassword)) {
            return new ResponseEntity(HttpStatus.ACCEPTED);
        }

        Date fechaActual = new Date();

        String infoToken = Integer.toString(user.getId()) + Long.toString(fechaActual.getTime());

        String token = Md5Encrypt.get_md5(infoToken);
        
        UsuarioSesion usuarioSesion = new UsuarioSesion();
        
        usuarioSesion.setToken(token);
        usuarioSesion.setFechaInicio(fechaActual);
        usuarioSesion.setFechaFin(fechaActual);
        usuarioSesion.setUsuario(user);
       

        usuarioSesionRepo.save(usuarioSesion);

        return new ResponseEntity(usuarioSesion, HttpStatus.OK);

    }

    @Override
    public ResponseEntity<Boolean> isSessionValid(String token, Integer userId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity logout(String token, Integer userId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
