package net.apps.rsapp.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idusuario;
    private String nomeusuario;
    private String siglafac;

    public Usuario() {}
    
    public Usuario(String nomeusuario, String siglafac) {
        this.nomeusuario = nomeusuario;
        this.siglafac = siglafac;
    }

    public Long getIdusuario(){
        return this.idusuario;
    }

    public String getNomeusuario(){
        return this.nomeusuario;
    }

    public String getSiglafac(){
        return this.siglafac;
    }

    public void SetIdusuario(Long idusuario){
        this.idusuario = idusuario;
    }

    public void SetNomeusuario(String nomeusuario){
        this.nomeusuario = nomeusuario;
    }

    public void SetSiglafac(String siglafac){
        this.siglafac = siglafac;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (!(o instanceof Usuario))
            return false;
        
        Usuario usuario = (Usuario) o;
        return Objects.equals(this.idusuario, usuario.idusuario) && 
            Objects.equals(this.nomeusuario, usuario.nomeusuario) && 
            Objects.equals(this.siglafac, usuario.siglafac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.idusuario, this.nomeusuario, this.siglafac);
    }

    @Override
    public String toString(){
        return "Usuario{" + "idusuario=" + this.idusuario + ", nomeusuario=" + 
            this.nomeusuario + '\'' + ", siglafac=" + this.siglafac + 
            '\'' + '}';
    }

}
