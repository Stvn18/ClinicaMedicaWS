/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.repo;

import gt.umg.clinica.entities.Asignacion;
import gt.umg.clinica.entities.Paciente;
import gt.umg.clinica.entities.Trabajador;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Steven
 */

@Repository()
public interface AsignacionRepo extends JpaRepository<Asignacion, Integer> {
    
    @Override
    List <Asignacion> findAll();
    
    Date findByfecha(Date fecha);
    
    List <Paciente> findByPaciente(Paciente paciente);
    
    List <Trabajador> findByTrabajador(Trabajador trabajador);
    
    @Query("select max(id) from Asignacion")
    Integer findByIdAsigacion();
    
}
