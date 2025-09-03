package net.apps.rsapp.dto.SalaDTO;


public class SalaDTO {
    private Long nmrsala;
    private String idbloco;

    public SalaDTO() {}

    public SalaDTO(Long nmrsala, String idbloco) {
        this.nmrsala = nmrsala;
        this.idbloco = idbloco;
    }

    public Long getNmrsala() {
        return nmrsala;
    }

    public void setNmrsala(Long nmrsala) {
        this.nmrsala = nmrsala;
    }

    public String getIdbloco() {
        return idbloco;
    }

    public void setIdbloco(String idbloco) {
        this.idbloco = idbloco;
    }
}

