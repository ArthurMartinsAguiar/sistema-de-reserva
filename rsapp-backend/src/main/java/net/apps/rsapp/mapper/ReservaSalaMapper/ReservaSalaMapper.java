package net.apps.rsapp.mapper.ReservaSalaMapper;

import net.apps.rsapp.dto.ReservaSalaDTO.ReservaSalaDTO;
import net.apps.rsapp.entity.reservaSala.ReservaSala;

public class ReservaSalaMapper {

    public static ReservaSalaDTO mapToReservaSalaDTO(ReservaSala reservaSala) {
        return new ReservaSalaDTO(
                reservaSala.getEmailUsuario(),
                reservaSala.getSiglaCampi(),
                reservaSala.getIdBloco(),
                reservaSala.getNmrSala(),
                reservaSala.getDataInicio(),
                reservaSala.getDataFim());
    }


    public static ReservaSala mapToReservaSala(ReservaSalaDTO reservaSalaDTO) {
        ReservaSala reservaSala = new ReservaSala();
        reservaSala.setEmailUsuario(reservaSalaDTO.getEmailUsuario());
        reservaSala.setSiglaCampi(reservaSalaDTO.getSiglaCampi());
        reservaSala.setIdBloco(reservaSalaDTO.getIdBloco());
        reservaSala.setNmrSala(reservaSalaDTO.getNmrSala());
        reservaSala.setDataInicio(reservaSalaDTO.getDataInicio());
        reservaSala.setDataFim(reservaSalaDTO.getDataFim());

        return reservaSala;
    }
}
