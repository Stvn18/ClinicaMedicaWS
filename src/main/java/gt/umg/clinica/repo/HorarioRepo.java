package gt.umg.clinica.repo;

import gt.umg.clinica.entities.Horario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository()
public interface HorarioRepo extends JpaRepository<Horario, Integer> {
    
    @Override()
    List<Horario> findAll();
    
}