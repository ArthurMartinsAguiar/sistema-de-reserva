package net.apps.rsapp.entity.sala;

import java.io.Serializable;
import java.util.Objects;

public class SalaId implements Serializable {
    private Long nmrsala;
    private String idbloco;

    public SalaId(){}

    public SalaId(Long nmrsala, String idbloco){
        this.nmrsala = nmrsala;
        this.idbloco = idbloco;
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
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (!(o instanceof Sala))
            return false;
        
        SalaId salaId = (SalaId) o;
        return Objects.equals(this.nmrsala, salaId.nmrsala) && 
            Objects.equals(this.idbloco, salaId.idbloco) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nmrsala, this.idbloco);
    }
}
