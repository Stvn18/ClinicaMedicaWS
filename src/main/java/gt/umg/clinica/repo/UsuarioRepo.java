/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.repo;

import gt.umg.clinica.entities.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author steven
 */

@Repository()
public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {
    
    @Override
    List <Usuario> findAll();
    
    Integer findById(Integer id);
    
    String findByUsuario(String usuario);
    
    @Query("select max(id) from Usuario")
    Integer findByMaxId();
    
}
