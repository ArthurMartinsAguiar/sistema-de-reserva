package net.apps.rsapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import net.apps.rsapp.dto.ReservasalaDTO;
import net.apps.rsapp.dto.UsuarioDTO;
import net.apps.rsapp.entity.ReservaSala;
import net.apps.rsapp.mapper.ReservasalaMapper;
import net.apps.rsapp.repository.ReservasalaRepository;

@Service
public class ReservaSalaServiceImpl implements ReservaSalaService{
    
    private final ReservasalaRepository reservaSalaRepository;
    private final UsuarioService usuarioService;

    public ReservaSalaServiceImpl(ReservasalaRepository reservaSalaRepository, UsuarioService usuarioService){
        this.reservaSalaRepository = reservaSalaRepository;
        this.usuarioService = usuarioService;
    }

    @Override
    public ReservasalaDTO createReservaSala(ReservasalaDTO reservaSalaCreateDTO){
        ReservaSala reservaSala = ReservasalaMapper.mapToReservaSala(reservaSalaCreateDTO);
        @SuppressWarnings("unused")
        UsuarioDTO usuarioDTO = usuarioService.findOrCreateUsuario(reservaSala.getEmailUsuario());
        ReservaSala savedReservaSala = reservaSalaRepository.save(reservaSala);
        return ReservasalaMapper.mapToReservaSalaDTO(savedReservaSala);
    }

    @Override
    public List<ReservasalaDTO> readReservaSala() {
        List<ReservaSala> reservasSala = reservaSalaRepository.findAll();
        return reservasSala.stream().map((reservaSala) -> 
            ReservasalaMapper.mapToReservaSalaDTO(reservaSala)).
            collect(Collectors.toList());
    }
}
