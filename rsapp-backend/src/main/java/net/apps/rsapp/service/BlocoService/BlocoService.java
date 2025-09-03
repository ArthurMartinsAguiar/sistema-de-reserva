package net.apps.rsapp.service.BlocoService;

import java.util.List;
import net.apps.rsapp.dto.BlocoDTO.BlocoDTO;

public interface BlocoService {
    public List<BlocoDTO> listAllBlocosAtCampi(String siglacampi);
}
