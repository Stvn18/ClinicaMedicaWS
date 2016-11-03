/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.impl;

import gt.umg.clinica.entities.Usuario;
import gt.umg.clinica.inte.UsuarioInte;
import gt.umg.clinica.repo.UsuarioRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author steven
 */

@Component()
public class UsuarioImpl implements UsuarioInte {
    
    @Autowired()
    UsuarioRepo usuarioRepo;

    @Override
    public ResponseEntity<Usuario> findAll() throws Exception {
        
        List<Usuario> usuarios = usuarioRepo.findAll();
        
        return new ResponseEntity(usuarios, HttpStatus.OK);
        
    }
    
    @Override
    public ResponseEntity <Usuario> findByUser(String usuario) throws Exception {
        
      Usuario us = usuarioRepo.findByUsuario(usuario);
      
      if("".equals(us) || us == null){
          return new ResponseEntity("El usuario no existe", HttpStatus.NOT_FOUND);
      }else{
          return new ResponseEntity(us,HttpStatus.OK);
      }
        
    }

    @Override
    public ResponseEntity<Usuario> doCreate(String token, Integer userId, Usuario usuario) throws Exception {
        
        if("".equals(usuario.getUsuario()) || usuario.getUsuario()==null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
        if("".equals(usuario.getPassword()) || usuario.getPassword()==null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
        if("".equals(usuario.getNombreUsuario()) || usuario.getNombreUsuario()==null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
        Usuario user = usuarioRepo.findByUsuario(usuario.getUsuario());
        
        if(user != null){
            return new ResponseEntity("El usuario Ya Existe", HttpStatus.FOUND);
        }
        
        Integer maxId = usuarioRepo.findByMaxId();
        
        if(maxId==null){
            maxId = 1;
        }else{
            maxId+=1;
        }
        
        usuario.setEstado(1);
        
        usuarioRepo.save(usuario);
        
        return new ResponseEntity(usuario,HttpStatus.CREATED);
        
    }
   
}
