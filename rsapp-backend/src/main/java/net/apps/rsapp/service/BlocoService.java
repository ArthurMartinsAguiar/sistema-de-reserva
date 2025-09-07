package net.apps.rsapp.service;

import java.util.List;

import net.apps.rsapp.dto.BlocoDTO;

public interface BlocoService {
    public List<BlocoDTO> listAllBlocosAtCampi(String siglacampi);
}
