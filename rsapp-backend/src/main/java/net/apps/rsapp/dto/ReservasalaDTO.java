package net.apps.rsapp.dto;

import java.time.LocalDateTime;

public class ReservasalaDTO {
    private String emailUsuario;
    private String siglaCampi;
    private String idBloco;
    private int nmrSala;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;

    public ReservasalaDTO(){}

    public ReservasalaDTO(
                        String emailUsuario,
                        String siglacampi,
                        String idbloco,
                        int nmrsala,
                        LocalDateTime data_inicio,
                        LocalDateTime data_fim
    ){
        this.emailUsuario = emailUsuario;
        this.siglaCampi = siglacampi;
        this.idBloco = idbloco;
        this.nmrSala = nmrsala;
        this.dataInicio = data_inicio;
        this.dataFim = data_fim;
    }
    
    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSiglaCampi() {
        return this.siglaCampi;
    }

    public void setSiglaCampi(String siglacampi) {
        this.siglaCampi = siglacampi;
    }

    public String getIdBloco() {
        return this.idBloco;
    }

    public void setIdBloco(String idbloco) {
        this.idBloco = idbloco;
    }

    public int getNmrSala() {
        return this.nmrSala;
    }

    public void setNmrSala(int nmrsala) {
        this.nmrSala = nmrsala;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime data_inicio) {
        this.dataInicio = data_inicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime data_fim) {
        this.dataFim = data_fim;
    }

}
