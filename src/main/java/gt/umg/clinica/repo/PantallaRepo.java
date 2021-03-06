/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.repo;

import gt.umg.clinica.entities.Pantalla;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author steven
 */

@Repository()
public interface PantallaRepo extends JpaRepository<Pantalla, Integer> {
    
    @Override
    List <Pantalla> findAll();
    
    Integer findById(Integer id);
    
}
