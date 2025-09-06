package net.apps.rsapp.dto.usuarioDTO;

public class UsuarioDTO {
    private String email;
    private String siglaFac;

    // Constructors
    public UsuarioDTO() {
    }

    public UsuarioDTO(String email, String siglafac) {
        this.email = email;
        this.siglaFac = siglafac;
    }

    // Getters

    public String getEmail() {
        return this.email;
    }

    public String getSiglaFac() {
        return this.siglaFac;
    }
}
