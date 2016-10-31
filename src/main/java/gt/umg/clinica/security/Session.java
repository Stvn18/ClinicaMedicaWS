package gt.umg.clinica.security;

import gt.umg.clinica.entities.Usuario;
import gt.umg.clinica.entities.UsuarioSesion;
import gt.umg.clinica.repo.UsuarioSesionRepo;
import org.springframework.beans.factory.annotation.Autowired;


public class Session {
    
    @Autowired()
    private UsuarioSesionRepo usuarioSesionRepo;
    
    public boolean isSessionValid(String token, Integer userId) throws Exception {
        
        UsuarioSesion usuarioSesion = usuarioSesionRepo.findByTokenAndUsuario(token, new Usuario());
        
        if(usuarioSesion == null){
            return false;
        }
        
        return usuarioSesion.getFechaFin().getTime() == usuarioSesion.getFechaInicio().getTime();
        
    }
    
    
}