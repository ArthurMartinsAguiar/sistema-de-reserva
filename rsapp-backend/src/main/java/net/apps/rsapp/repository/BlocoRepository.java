package net.apps.rsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.apps.rsapp.dto.BlocoDTO;
import net.apps.rsapp.entity.BlocoPK;
import net.apps.rsapp.entity.Bloco;

import java.util.List;

public interface BlocoRepository extends JpaRepository<Bloco, BlocoPK>{
    @Query( "SELECT NEW net.apps.rsapp.dto.BlocoDTO(b.idbloco)" + 
            "FROM Bloco b WHERE b.siglacampi = :siglacampi")
    List<BlocoDTO> listAllBlocosAtCampi(String siglacampi);
}
