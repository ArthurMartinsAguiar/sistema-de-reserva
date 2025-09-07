package net.apps.rsapp.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name = "email", columnDefinition = "VARCHAR(100)", length = 100)
    private String email;

    @Column(name = "siglafac", columnDefinition = "CHAR(3)", length = 3)
    private String siglaFac;

    public Usuario() {
    }

    public Usuario(String email, String siglafac) {
        this.email = email;
        this.siglaFac = siglafac;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSiglaFac() {
        return this.siglaFac;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSiglaFac(String siglafac) {
        this.siglaFac = siglafac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Usuario))
            return false;

        Usuario usuario = (Usuario) o;
        return Objects.equals(this.email, usuario.email) &&
                Objects.equals(this.siglaFac, usuario.siglaFac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.email, this.siglaFac);
    }

    @Override
    public String toString() {
        return "Usuario{" + ", email=" +
                this.email + '\'' + ", siglafac=" + this.siglaFac +
                '\'' + '}';
    }
}
