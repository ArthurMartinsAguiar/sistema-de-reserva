package net.apps.rsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import net.apps.rsapp.dto.CampiDTO.CampiDTO;
import net.apps.rsapp.entity.campi.Campi;

public interface CampiRepository extends JpaRepository<Campi, String>{
    @Query("SELECT c.siglacampi FROM Campi c")
    List<CampiDTO> findAllCampis();
}
