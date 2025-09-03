package net.apps.rsapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity
public class Campi {
    @Id
    @Column(name = "siglacampi", columnDefinition = "CHAR(2)", length = 2)
    private String siglacampi;

    @Column(name = "siglafac", columnDefinition = "CHAR(3)", length = 3)
    private String siglafac;

    public Campi(){}

    public Campi(String siglacampi, String siglafac){
        this.siglacampi = siglacampi;
        this.siglafac = siglafac;
    }

    public String getsiglacampi(){
        return this.siglacampi;
    }

    public void setsiglacampi(String siglacampi){
        this.siglacampi = siglacampi;
    }

    public String getsiglafac(){
        return this.siglafac;
    }

    public void setsiglafac(String siglafac){
        this.siglafac = siglafac;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (!(o instanceof Usuario))
            return false;
        
        Campi campi = (Campi) o;
        return Objects.equals(this.siglacampi, campi.siglacampi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.siglacampi);
    }

    @Override
    public String toString(){
        return "Campi{" + "siglacampi=" + this.siglacampi + '}';
    }

}
