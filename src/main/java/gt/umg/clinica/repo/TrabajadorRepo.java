/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.repo;

import gt.umg.clinica.entities.Trabajador;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Steven
 */

@Repository()
public interface TrabajadorRepo extends JpaRepository<Trabajador, Integer> {
    
    @Override
    List <Trabajador> findAll();
    
    Integer findById(Integer id);
    
    String findByNombre(String nombre);
    
    @Query("select max(id) from Trabajador")
    Integer findByMaxIdTrabajador();
    
    
    
}
