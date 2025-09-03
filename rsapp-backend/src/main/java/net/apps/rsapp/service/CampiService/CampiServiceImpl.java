package net.apps.rsapp.service.CampiService;

import java.util.List;

import org.springframework.stereotype.Service;

import net.apps.rsapp.dto.CampiDTO.CampiDTO;
import net.apps.rsapp.repository.CampiRepository;

@Service
public class CampiServiceImpl implements CampiService {

    private final CampiRepository campiRepository;
    public CampiServiceImpl(CampiRepository campiRepository){
        this.campiRepository = campiRepository;
    }

    @Override
    public List<CampiDTO> findAllCampis() {
        return campiRepository.findAllCampis();
    }

}
