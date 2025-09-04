package net.apps.rsapp.entity.Reserva;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@IdClass( ReservaSalaPK.class )
@Table(name = "reservasala")
public class ReservaSala {
    
    @Id
    @Column(name = "idusuario")
    private Long idUsuario;

    @Id
    @Column(name = "siglacampi", columnDefinition = "CHAR(2)", length = 2)
    private String siglacampi;
    
    @Id
    @Column(name = "idbloco", columnDefinition = "CHAR(4)", length = 4)
    private String idbloco;
   
    @Id
    @Column(name = "nmrsala", columnDefinition = "SMALLINT")
    private int nmrsala;
    
    private LocalDateTime data_inicio;
    private LocalDateTime data_fim;

    public ReservaSalaPK getPK(){
        return new ReservaSalaPK(idUsuario, siglacampi, idbloco, nmrsala);
    }
    
    public void setPK(ReservaSalaPK pk){
        this.idUsuario = pk.getIdUsuario();
        this.siglacampi = pk.getSiglaCampi();
        this.idbloco = pk.getIdBloco();
        this.nmrsala = pk.getNmrSala();
    }
    
    //getters and setters
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

    public LocalDateTime getDataInicio() {
        return data_inicio;
    }

    public void setDataInicio(LocalDateTime data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDateTime getDataFim() {
        return data_fim;
    }

    public void setDataFim(LocalDateTime data_fim) {
        this.data_fim = data_fim;
    }
    
}