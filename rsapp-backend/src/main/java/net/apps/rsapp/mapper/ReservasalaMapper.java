package net.apps.rsapp.mapper;

import net.apps.rsapp.dto.ReservasalaDTO;
import net.apps.rsapp.entity.ReservaSala;

public class ReservasalaMapper {

    public static ReservasalaDTO mapToReservaSalaDTO(ReservaSala reservaSala) {
        return new ReservasalaDTO(
                reservaSala.getEmailUsuario(),
                reservaSala.getSiglaCampi(),
                reservaSala.getIdBloco(),
                reservaSala.getNmrSala(),
                reservaSala.getDataInicio(),
                reservaSala.getDataFim());
    }


    public static ReservaSala mapToReservaSala(ReservasalaDTO reservaSalaDTO) {
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
