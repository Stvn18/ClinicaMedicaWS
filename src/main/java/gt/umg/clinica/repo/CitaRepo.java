package gt.umg.clinica.repo;

import gt.umg.clinica.entities.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface CitaRepo extends JpaRepository<Cita, Integer> {
    
    
    
}