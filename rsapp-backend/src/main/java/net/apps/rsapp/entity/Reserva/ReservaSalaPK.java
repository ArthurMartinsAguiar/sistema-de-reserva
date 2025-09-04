package net.apps.rsapp.entity.Reserva;
import java.util.Objects;

public class ReservaSalaPK {

    private Long idUsuario;
    private String siglacampi;
    private String idbloco;
    private int nmrsala;

    public ReservaSalaPK(){}

    public ReservaSalaPK(Long idUsuario,
                         String siglacampi,
                         String idbloco,
                         int nmrsala
    ){
        this.idUsuario = idUsuario;
        this.siglacampi = siglacampi;
        this.idbloco = idbloco;
        this.nmrsala = nmrsala;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public String getSiglaCampi() {
        return this.siglacampi;
    }
    
    public void setSiglaCampi(String siglacampi) {
        this.siglacampi = siglacampi;
    }
    
    public String getIdBloco() {
        return this.idbloco;
    }
    
    public void setIdBloco(String idbloco) {
        this.idbloco = idbloco;
    }
    
    public int getNmrSala() {
        return this.nmrsala;
    }

    public void setNmrSala(int nmrsala) {
        this.nmrsala = nmrsala;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof ReservaSala))
            return false;

        ReservaSalaPK reservaSalaPK = (ReservaSalaPK) o;
        return Objects.equals(this.idUsuario, reservaSalaPK.idUsuario) &&
               Objects.equals(this.siglacampi, reservaSalaPK.siglacampi) &&
               Objects.equals(this.idbloco, reservaSalaPK.idbloco) &&
               Objects.equals(this.nmrsala, reservaSalaPK.nmrsala);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.idUsuario, this.idbloco, this.siglacampi, this.nmrsala);
    }
}
