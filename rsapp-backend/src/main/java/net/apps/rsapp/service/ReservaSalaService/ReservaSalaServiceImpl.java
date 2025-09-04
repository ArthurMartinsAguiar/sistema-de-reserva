package net.apps.rsapp.service.ReservaSalaService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import net.apps.rsapp.dto.ReservaSalaDTO.ReservaSalaCreateDTO;
import net.apps.rsapp.dto.ReservaSalaDTO.ReservaSalaResponseDTO;
import net.apps.rsapp.entity.Reserva.ReservaSala;
import net.apps.rsapp.mapper.ReservaSalaMapper.ReservaSalaMapper;
import net.apps.rsapp.repository.ReservaSalaRepository;

@Service
public class ReservaSalaServiceImpl implements ReservaSalaService{
    
    private final ReservaSalaRepository reservaSalaRepository;
    public ReservaSalaServiceImpl(ReservaSalaRepository reservaSalaRepository){
        this.reservaSalaRepository = reservaSalaRepository;
    }

    public ReservaSalaResponseDTO createReservaSala(ReservaSalaCreateDTO reservaSalaCreateDTO){
        ReservaSala reservaSala = ReservaSalaMapper.mapToReservaSala(reservaSalaCreateDTO);
        ReservaSala savedReservaSala = reservaSalaRepository.save(reservaSala);
        return ReservaSalaMapper.mapToReservaSalaResponseDTO(savedReservaSala);
    }

    @Override
    public List<ReservaSalaResponseDTO> readReservaSala() {
        List<ReservaSala> reservasSala = reservaSalaRepository.findAll();
        return reservasSala.stream().map((reservaSala) -> 
            ReservaSalaMapper.mapToReservaSalaResponseDTO(reservaSala)).
            collect(Collectors.toList());
    }
}
