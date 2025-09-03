package net.apps.rsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import net.apps.rsapp.entity.Campi;
import java.util.List;
import net.apps.rsapp.dto.CampiDTO.CampiDTO;


public interface CampiRepository extends JpaRepository<Campi, String>{
    @Query("SELECT c.siglacampi FROM Campi c")
    List<CampiDTO> findAllCampis();
}
