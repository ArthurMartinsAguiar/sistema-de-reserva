package net.apps.rsapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.apps.rsapp.dto.BlocoDTO;
import net.apps.rsapp.service.BlocoService;

import java.util.List;

@RestController
@RequestMapping("/blocos")
public class BlocoController {
    private final BlocoService blocoService;

    public BlocoController(BlocoService blocoService){
        this.blocoService = blocoService;
    }

    @GetMapping("/{siglacampi}")
    public ResponseEntity<List<BlocoDTO>> all(@PathVariable String siglacampi){
        List<BlocoDTO> blocos = blocoService.listAllBlocosAtCampi(siglacampi);
        return new ResponseEntity<>(blocos, HttpStatus.OK); 
    }
}
