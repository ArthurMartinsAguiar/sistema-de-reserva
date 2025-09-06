package net.apps.rsapp.service.ReservaSalaService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import net.apps.rsapp.dto.ReservaSalaDTO.ReservaSalaDTO;
import net.apps.rsapp.dto.usuarioDTO.UsuarioDTO;
import net.apps.rsapp.entity.reservaSala.ReservaSala;
import net.apps.rsapp.mapper.ReservaSalaMapper.ReservaSalaMapper;
import net.apps.rsapp.repository.ReservaSalaRepository;
import net.apps.rsapp.service.UsuarioService.UsuarioService;

@Service
public class ReservaSalaServiceImpl implements ReservaSalaService{
    
    private final ReservaSalaRepository reservaSalaRepository;
    private final UsuarioService usuarioService;
    public ReservaSalaServiceImpl(ReservaSalaRepository reservaSalaRepository, UsuarioService usuarioService){
        this.reservaSalaRepository = reservaSalaRepository;
        this.usuarioService = usuarioService;
    }

    public ReservaSalaDTO createReservaSala(ReservaSalaDTO reservaSalaCreateDTO){
        ReservaSala reservaSala = ReservaSalaMapper.mapToReservaSala(reservaSalaCreateDTO);
        @SuppressWarnings("unused")
        UsuarioDTO usuarioDTO = usuarioService.findOrCreateUsuario(reservaSala.getEmailUsuario());
        ReservaSala savedReservaSala = reservaSalaRepository.save(reservaSala);
        return ReservaSalaMapper.mapToReservaSalaDTO(savedReservaSala);
    }

    @Override
    public List<ReservaSalaDTO> readReservaSala() {
        List<ReservaSala> reservasSala = reservaSalaRepository.findAll();
        return reservasSala.stream().map((reservaSala) -> 
            ReservaSalaMapper.mapToReservaSalaDTO(reservaSala)).
            collect(Collectors.toList());
    }
}
