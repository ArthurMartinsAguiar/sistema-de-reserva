package net.apps.rsapp.controller.SalaController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.apps.rsapp.dto.SalaDTO.SalaDTO;
import net.apps.rsapp.service.SalaService.SalaService;

@RestController
@RequestMapping("/salas")
public class SalaController {

    private final SalaService salaService;
    public SalaController(SalaService salaService){
        this.salaService = salaService;
    }

    //TODO: IMPLEMENTAR SIGLACAMPI EM SALA (NA CLASSE, NA CLASSE DTO, REPOSITORIO E CONTROLLER)
    @GetMapping("/{siglacampi}/{idbloco}")
    public ResponseEntity<List<SalaDTO>> findAllSalasAtBloco(@PathVariable String idbloco) {
        List<SalaDTO> salas = salaService.findAllSalasAtBloco(idbloco);
        return new ResponseEntity<>(salas, HttpStatus.OK); 
    }
}
