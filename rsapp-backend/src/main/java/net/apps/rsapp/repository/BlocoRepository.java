package net.apps.rsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.apps.rsapp.entity.Bloco;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import net.apps.rsapp.dto.BlocoDTO.BlocoDTO;

public interface BlocoRepository extends JpaRepository<Bloco, String>{
    @Query("SELECT b.idbloco FROM Bloco b WHERE b.siglacampi = :siglacampi")
    List<BlocoDTO> listAllBlocosAtCampi(String siglacampi);
}
