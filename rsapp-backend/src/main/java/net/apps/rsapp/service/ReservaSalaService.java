package net.apps.rsapp.service;
import java.util.List;

import net.apps.rsapp.dto.ReservasalaDTO;

public interface ReservaSalaService {
    public ReservasalaDTO createReservaSala(ReservasalaDTO reservaSalaCreateDTO);
    /*
     * recebe request "POST"
     * verifica pelo email se o usuario existe
     * se n: cria um novo usuario
     * por fim busca o id e insere a reserva no banco de dados
     */

    public List<ReservasalaDTO> readReservaSala();
    //retorna uma lista de reservas
}
