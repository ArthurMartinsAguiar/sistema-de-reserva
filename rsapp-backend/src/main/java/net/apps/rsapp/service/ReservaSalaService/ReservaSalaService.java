package net.apps.rsapp.service.ReservaSalaService;
import java.util.List;

import net.apps.rsapp.dto.ReservaSalaDTO.ReservaSalaCreateDTO;
import net.apps.rsapp.dto.ReservaSalaDTO.ReservaSalaResponseDTO;

public interface ReservaSalaService {
    public ReservaSalaResponseDTO createReservaSala(ReservaSalaCreateDTO reservaSalaCreateDTO);
    /*
     * recebe request "POST"
     * verifica pelo email se o usuario existe
     * se n: cria um novo usuario
     * por fim busca o id e insere a reserva no banco de dados
     */

    public List<ReservaSalaResponseDTO> readReservaSala();
    //retorna uma lista de reservas
}
