package net.apps.rsapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@IdClass( SalaPK.class )
@Table(name = "sala")
public class Sala {
    
    @Id
    @Column(name = "siglacampi", columnDefinition = "CHAR(2)", length = 2)
    private String siglacampi;
        
    @Id
    @Column(name = "idbloco", columnDefinition = "CHAR(4)", length = 4)
    private String idbloco;
    
    @Id
    @Column(name = "nmrsala", columnDefinition = "SMALLINT")
    private int nmrsala;


    public SalaPK getPK(){
        return new SalaPK(siglacampi, idbloco, nmrsala);
    }

    public void setPK(SalaPK pk){
        this.siglacampi = pk.getSiglaCampi();
        this.idbloco = pk.getIdBloco();
        this.nmrsala = pk.getNmrSala();
    }

    public String getSiglaCampi(){
        return this.siglacampi;
    }

    public void setSiglaCampi(String siglacampi){
        this.siglacampi = siglacampi;
    }
    
    public String getIdBloco(){
        return this.idbloco;
    }

    public void setIdBloco(String idbloco){
        this.idbloco = idbloco;
    }

    public int getNmrSala(){
        return this.nmrsala;
    }

    public void setNmrSala(int nmrsala){
        this.nmrsala = nmrsala;
    }

    @Override
    public String toString(){
        return "Sala{" + "siglacampi=" + this.siglacampi + ", idbloco=" + 
            this.idbloco + "nmrsala=" + this.nmrsala +'}';
    }

}
