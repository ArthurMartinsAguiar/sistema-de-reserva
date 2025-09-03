package net.apps.rsapp.entity.Sala;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@IdClass( SalaId.class )
@Table(name = "sala")
public class Sala {
    @Id
    @Column(name = "nmrsala", columnDefinition = "SMALLINT")
    private Long nmrsala;

    @Id
    @Column(name = "idbloco", columnDefinition = "CHAR(4)", length = 4)
    private String idbloco;

    public SalaId getId(){
        return new SalaId(nmrsala, idbloco);
    }

    public void setId(SalaId id){
        this.nmrsala = id.getNmrSala();
        this.idbloco = id.getIdBloco();
    }

    public Long getNmrSala(){
        return this.nmrsala;
    }

    public String getIdBloco(){
        return this.idbloco;
    }

    public void setNmrSala(Long nmrsala){
        this.nmrsala = nmrsala;
    }

    public void setIdBloco(String idbloco){
        this.idbloco = idbloco;
    }

    @Override
    public String toString(){
        return "Sala{" + "nmrSala=" + this.nmrsala + ", idbloco=" + 
            this.idbloco + '}';
    }

}
