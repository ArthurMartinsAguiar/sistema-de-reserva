package net.apps.rsapp.controller.reservaSalaController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.apps.rsapp.dto.ReservaSalaDTO.ReservaSalaDTO;
import net.apps.rsapp.service.ReservaSalaService.ReservaSalaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/reserva-sala")
public class ReservaSalaController {

    private final ReservaSalaService reservaSalaService;

    public ReservaSalaController(ReservaSalaService reservaSalaService) {
        this.reservaSalaService = reservaSalaService;
    }

    @GetMapping
    public ResponseEntity<List<ReservaSalaDTO>> all() {
        List<ReservaSalaDTO> reservasSala = reservaSalaService.readReservaSala();
        return new ResponseEntity<>(reservasSala, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<ReservaSalaDTO> createReservaSala(@RequestBody ReservaSalaDTO reservaSalaDTO) {
        ReservaSalaDTO savedReservaSalaDTO = reservaSalaService.createReservaSala(reservaSalaDTO);
        return new ResponseEntity<>(savedReservaSalaDTO, HttpStatus.OK);
    }

    // TODO: POST METHOD, junto com a criação de novo usuário caso não exista.
}
