package net.apps.rsapp.dto;

public class SalaDTO {
    private int nmrsala;

    public SalaDTO() {}

    public SalaDTO(int nmrsala) {
        this.nmrsala = nmrsala;
    }

    public int getNmrSala(){
        return this.nmrsala;
    }

    public void setNmrSala(int nmrsala){
        this.nmrsala = nmrsala;
    }
}

