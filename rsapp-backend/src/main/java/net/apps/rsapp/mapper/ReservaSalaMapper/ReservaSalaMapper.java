package net.apps.rsapp.mapper.ReservaSalaMapper;

import net.apps.rsapp.dto.ReservaSalaDTO.ReservaSalaCreateDTO;
import net.apps.rsapp.dto.ReservaSalaDTO.ReservaSalaResponseDTO;
import net.apps.rsapp.entity.Reserva.ReservaSala;

public class ReservaSalaMapper {

    public static ReservaSalaCreateDTO mapToReservaSalaCreateDTO(ReservaSala reservaSala){
        return new ReservaSalaCreateDTO(
            reservaSala.getIdUsuario(),
            reservaSala.getSiglaCampi(),
            reservaSala.getIdBloco(),
            reservaSala.getNmrSala(),
            reservaSala.getDataInicio(),
            reservaSala.getDataFim()
        );
    }

    public static ReservaSalaResponseDTO mapToReservaSalaResponseDTO(ReservaSala reservaSala){
        return new ReservaSalaResponseDTO(
            reservaSala.getSiglaCampi(),
            reservaSala.getIdBloco(),
            reservaSala.getNmrSala(),
            reservaSala.getDataInicio(),
            reservaSala.getDataFim()
        );
    }

    public static ReservaSala mapToReservaSala(ReservaSalaCreateDTO reservaSalaCreateDTO){
        ReservaSala reservaSala = new ReservaSala();
        reservaSala.setIdUsuario(reservaSalaCreateDTO.getIdUsuario());
        reservaSala.setSiglaCampi(reservaSalaCreateDTO.getSiglaCampi());
        reservaSala.setIdBloco(reservaSalaCreateDTO.getIdBloco());
        reservaSala.setNmrSala(reservaSalaCreateDTO.getNmrSala());
        reservaSala.setDataInicio(reservaSalaCreateDTO.getDataInicio());
        reservaSala.setDataFim(reservaSalaCreateDTO.getDataFim());

        return reservaSala;
    }
}
