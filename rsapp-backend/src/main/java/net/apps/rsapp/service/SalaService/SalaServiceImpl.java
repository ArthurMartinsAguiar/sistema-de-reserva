package net.apps.rsapp.service.SalaService;

import java.util.List;

import org.springframework.stereotype.Service;

import net.apps.rsapp.dto.SalaDTO.SalaDTO;
import net.apps.rsapp.repository.SalaRepository;

@Service
public class SalaServiceImpl implements SalaService{
    private final SalaRepository salaRepository;

    public SalaServiceImpl(SalaRepository salaRepository){
        this.salaRepository = salaRepository;
    }

    @Override
    public List<SalaDTO> findAllSalasAtBloco(String siglacampi, String idbloco) {
        return salaRepository.findAllSalasAtBloco(siglacampi, idbloco);
    }
    
}
