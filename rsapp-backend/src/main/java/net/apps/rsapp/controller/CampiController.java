package net.apps.rsapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.apps.rsapp.dto.CampiDTO;
import net.apps.rsapp.service.CampiService;

import java.util.List;

@RestController
@RequestMapping("/campis")
public class CampiController {
    
    private final CampiService campiService;
    public CampiController(CampiService campiService){
        this.campiService = campiService;
    }

    @GetMapping
    public ResponseEntity<List<CampiDTO>> all(){
        List<CampiDTO> campis = campiService.findAllCampis();
        return ResponseEntity.ok(campis);
    }
}
