package net.apps.rsapp.entity.Usuario;

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
    private Long id;
    private String email;
    private String siglafac;

    public Usuario() {}
    
    public Usuario(String email, String siglafac) {
        this.email = email;
        this.siglafac = siglafac;
    }

    public Long getId(){
        return this.id;
    }

    public String getEmail(){
        return this.email;
    }

    public String getSiglafac(){
        return this.siglafac;
    }

    public void SetIdusuario(Long id){
        this.id = id;
    }

    public void SetNomeusuario(String email){
        this.email = email;
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
        return Objects.equals(this.id, usuario.id) && 
            Objects.equals(this.email, usuario.email) && 
            Objects.equals(this.siglafac, usuario.siglafac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.email, this.siglafac);
    }

    @Override
    public String toString(){
        return "Usuario{" + "idusuario=" + this.id + ", email=" + 
            this.email + '\'' + ", siglafac=" + this.siglafac + 
            '\'' + '}';
    }

}
