package net.apps.rsapp.dto.ReservaSalaDTO;

import java.time.LocalDateTime;

public class ReservaSalaResponseDTO {
    private String siglacampi;
    private String idbloco;
    private int nmrsala;
    private LocalDateTime data_inicio;
    private LocalDateTime data_fim;

    public ReservaSalaResponseDTO(){}
    
    public ReservaSalaResponseDTO(
                        String siglacampi,
                        String idbloco,
                        int nmrsala,
                        LocalDateTime data_inicio,
                        LocalDateTime data_fim
    ){
        this.siglacampi = siglacampi;
        this.idbloco = idbloco;
        this.nmrsala = nmrsala;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
    }
        
    public String getSiglaCampi() {
        return this.siglacampi;
    }
    
    public String getIdBloco() {
        return this.idbloco;
    }
    
    public int getNmrSala() {
        return this.nmrsala;
    }

    public LocalDateTime getDataInicio() {
        return data_inicio;
    }

    public LocalDateTime getDataFim() {
        return data_fim;
    }
}
