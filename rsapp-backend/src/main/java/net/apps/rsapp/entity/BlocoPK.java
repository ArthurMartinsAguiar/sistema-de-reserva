package net.apps.rsapp.entity;

import java.io.Serializable;
import java.util.Objects;

public class BlocoPK implements Serializable{
    private String siglacampi;
    private String idbloco;
    
    public BlocoPK(){}
    public BlocoPK(String siglacampi, String idbloco){
        this.siglacampi = siglacampi;
        this.idbloco = idbloco;
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

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (!(o instanceof Sala))
            return false;
        
        BlocoPK blocoPK = (BlocoPK) o;
        return  Objects.equals(this.siglacampi, blocoPK.siglacampi) &&
                Objects.equals(this.idbloco, blocoPK.idbloco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.siglacampi, this.idbloco);
    }
}
