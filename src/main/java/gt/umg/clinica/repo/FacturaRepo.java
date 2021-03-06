/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.repo;

import gt.umg.clinica.entities.Factura;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Steven
 */

@Repository()
public interface FacturaRepo extends JpaRepository<Factura, Integer>{
    
    @Override
    List <Factura> findAll();
    
    Integer findById(Integer id);
    
    @Query("select max(id) from Factura")
    Integer findByMaxIdFactura();
    
}
