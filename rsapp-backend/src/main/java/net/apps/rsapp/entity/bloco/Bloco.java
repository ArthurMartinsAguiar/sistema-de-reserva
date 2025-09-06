package net.apps.rsapp.entity.bloco;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@IdClass( BlocoPK.class )
@Table(name = "bloco")
public class Bloco {
    @Id
    @Column(name = "siglacampi", columnDefinition = "CHAR(2)", length = 2)
    private String siglacampi;
        
    @Id
    @Column(name = "idbloco", columnDefinition = "CHAR(4)", length = 4)
    private String idbloco;

    public BlocoPK getPK(){
        return new BlocoPK(siglacampi, idbloco);
    }

    public void setPK(BlocoPK pk){
        this.siglacampi = pk.getSiglaCampi();
        this.idbloco = pk.getIdBloco();
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
    public String toString(){
        return "Bloco{" + "siglacampi=" + this.siglacampi + ", idbloco=" + 
            this.idbloco + '}';
    }
}
