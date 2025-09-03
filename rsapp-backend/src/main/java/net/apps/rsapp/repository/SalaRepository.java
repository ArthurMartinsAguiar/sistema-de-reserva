package net.apps.rsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.apps.rsapp.dto.SalaDTO.SalaDTO;
import net.apps.rsapp.entity.Sala.Sala;
import net.apps.rsapp.entity.Sala.SalaId;

import java.util.List;

public interface SalaRepository extends JpaRepository<Sala, SalaId> {
    @Query("SELECT NEW net.apps.rsapp.dto.SalaDTO.SalaDTO(s.nmrsala, s.idbloco) " +
           "FROM Sala s WHERE s.idbloco = :idbloco")
    List<SalaDTO> findAllSalasAtBloco(String idbloco);
}
