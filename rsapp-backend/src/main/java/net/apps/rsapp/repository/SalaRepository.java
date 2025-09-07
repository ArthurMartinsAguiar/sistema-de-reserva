package net.apps.rsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.apps.rsapp.dto.SalaDTO;
import net.apps.rsapp.entity.Sala;
import net.apps.rsapp.entity.SalaPK;

import java.util.List;

public interface SalaRepository extends JpaRepository<Sala, SalaPK> {
    @Query("SELECT NEW net.apps.rsapp.dto.SalaDTO(s.nmrsala)" +
           "FROM Sala s WHERE s.siglacampi = :siglacampi AND s.idbloco = :idbloco")
    List<SalaDTO> findAllSalasAtBloco(String siglacampi, String idbloco);
}
