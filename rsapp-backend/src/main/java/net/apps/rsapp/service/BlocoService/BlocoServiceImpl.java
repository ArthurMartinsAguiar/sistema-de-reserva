package net.apps.rsapp.service.BlocoService;

import java.util.List;

import org.springframework.stereotype.Service;

import net.apps.rsapp.dto.BlocoDTO.BlocoDTO;
import net.apps.rsapp.repository.BlocoRepository;

@Service
public class BlocoServiceImpl implements BlocoService{

    private final BlocoRepository blocoRepository;
    public BlocoServiceImpl(BlocoRepository blocoRepository){
        this.blocoRepository = blocoRepository;
    }

    @Override
    public List<BlocoDTO> listAllBlocosAtCampi(String siglacampi) {
        return blocoRepository.listAllBlocosAtCampi(siglacampi);
    }
    
}
