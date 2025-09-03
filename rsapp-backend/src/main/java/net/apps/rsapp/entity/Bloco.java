package net.apps.rsapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bloco")
public class Bloco {

    //TODO: IMPLEMENTAR COMPOSITE KEYS (ALTERAR SERVICE E REPOSITORY)
    @Id
    @Column(name = "idbloco", columnDefinition = "CHAR(4)", length = 4)
    private String idbloco;

    @Column(name = "siglacampi", columnDefinition = "CHAR(2)", length = 2)
    private String siglacampi;

    public Bloco(){}

    public Bloco(String idbloco, String siglacampi){
        this.idbloco = idbloco;
        this.siglacampi = siglacampi;
    }

    public String getIdBloco(){
        return this.idbloco;
    }

    public void setIdBloco(String idbloco){
        this.idbloco = idbloco;
    }

    public String getsiglacampi(){
        return this.siglacampi;
    }

    public void setsiglacampi(String siglacampi){
        this.siglacampi = siglacampi;
    }
}
