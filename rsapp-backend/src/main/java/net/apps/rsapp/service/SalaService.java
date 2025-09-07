package net.apps.rsapp.service;

import java.util.List;

import net.apps.rsapp.dto.SalaDTO;

public interface SalaService {
    public List<SalaDTO> findAllSalasAtBloco(String siglacampi, String idbloco);
}
