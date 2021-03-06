/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.repo;

import gt.umg.clinica.entities.Factura;
import gt.umg.clinica.entities.FacturaDetalle;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Steven
 */

@Repository()
public interface FacturaDetalleRepo extends JpaRepository<FacturaDetalle, Integer>{
    
    @Override
    List <FacturaDetalle> findAll();
    
    List <Factura> findByFactura(Factura factura);
    
    @Query("select max(id) from FacturaDetalle")
    Integer findByMaxIdFacturaDetalle();
    
}
