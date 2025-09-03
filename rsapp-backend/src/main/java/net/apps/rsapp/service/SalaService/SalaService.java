package net.apps.rsapp.service.SalaService;

import net.apps.rsapp.dto.SalaDTO.SalaDTO;
import java.util.List;

public interface SalaService {
    public List<SalaDTO> findAllSalasAtBloco(String idbloco);
}
