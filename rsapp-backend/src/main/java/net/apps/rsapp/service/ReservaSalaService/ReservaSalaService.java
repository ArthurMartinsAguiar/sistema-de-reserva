package net.apps.rsapp.service.ReservaSalaService;
import java.util.List;

import net.apps.rsapp.dto.ReservaSalaDTO.ReservaSalaDTO;

public interface ReservaSalaService {
    public ReservaSalaDTO createReservaSala(ReservaSalaDTO reservaSalaCreateDTO);
    /*
     * recebe request "POST"
     * verifica pelo email se o usuario existe
     * se n: cria um novo usuario
     * por fim busca o id e insere a reserva no banco de dados
     */

    public List<ReservaSalaDTO> readReservaSala();
    //retorna uma lista de reservas
}
