package net.apps.rsapp.controller.ReservaSalaController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.apps.rsapp.dto.ReservaSalaDTO.ReservaSalaResponseDTO;
import net.apps.rsapp.service.ReservaSalaService.ReservaSalaService;

@RestController
@RequestMapping("/reserva_sala")
public class ReservaSalaController {
    
    private final ReservaSalaService reservaSalaService;
    public ReservaSalaController(ReservaSalaService reservaSalaService){
        this.reservaSalaService = reservaSalaService;
    }

    @GetMapping
    public ResponseEntity<List<ReservaSalaResponseDTO>> all(){
        List<ReservaSalaResponseDTO> reservasSala = reservaSalaService.readReservaSala();
        return new ResponseEntity<>(reservasSala, HttpStatus.OK);
    }

    //TODO: POST METHOD, junto com a criação de novo usuário caso não exista.
}
