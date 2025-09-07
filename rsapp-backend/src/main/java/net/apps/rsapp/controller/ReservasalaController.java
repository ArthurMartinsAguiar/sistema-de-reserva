package net.apps.rsapp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.apps.rsapp.dto.ReservasalaDTO;
import net.apps.rsapp.service.ReservaSalaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/reserva-sala")
public class ReservasalaController {

    private final ReservaSalaService reservaSalaService;

    public ReservasalaController(ReservaSalaService reservaSalaService) {
        this.reservaSalaService = reservaSalaService;
    }

    @GetMapping
    public ResponseEntity<List<ReservasalaDTO>> all() {
        List<ReservasalaDTO> reservasSala = reservaSalaService.readReservaSala();
        return new ResponseEntity<>(reservasSala, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<ReservasalaDTO> createReservaSala(@RequestBody ReservasalaDTO reservaSalaDTO) {
        ReservasalaDTO savedReservaSalaDTO = reservaSalaService.createReservaSala(reservaSalaDTO);
        return new ResponseEntity<>(savedReservaSalaDTO, HttpStatus.OK);
    }

}
