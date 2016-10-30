/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Steven
 */

@Repository()
public interface FacturaRepo extends JpaRepository<FacturaRepo, Integer>{
    
    @Override
    List <FacturaRepo> findAll();
    
    Integer findById(Integer id);
    
    @Query("select max(id) from Factura")
    Integer findByMaxIdFactura();
    
}
