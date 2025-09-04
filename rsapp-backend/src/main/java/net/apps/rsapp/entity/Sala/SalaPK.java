package net.apps.rsapp.entity.Sala;

import java.io.Serializable;
import java.util.Objects;

public class SalaPK implements Serializable {
    private String siglacampi;
    private String idbloco;
    private int nmrsala;

    public SalaPK(){}

    public SalaPK(String siglacampi, String idbloco, int nmrsala){
        this.siglacampi = siglacampi;
        this.idbloco = idbloco;
        this.nmrsala = nmrsala;
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
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (!(o instanceof Sala))
            return false;
        
        SalaPK salaPK = (SalaPK) o;
        return  Objects.equals(this.siglacampi, salaPK.siglacampi) &&
                Objects.equals(this.idbloco, salaPK.idbloco) &&
                Objects.equals(this.nmrsala, salaPK.nmrsala);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.siglacampi, this.idbloco, this.nmrsala);
    }
}
