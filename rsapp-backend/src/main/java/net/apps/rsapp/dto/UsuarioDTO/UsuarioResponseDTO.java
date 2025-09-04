package net.apps.rsapp.dto.UsuarioDTO;

public class UsuarioResponseDTO {
    private Long id;
    private String email;
    private String siglafac;

    //Constructors
    public UsuarioResponseDTO() {}
    
    public UsuarioResponseDTO(Long id, String email, String siglafac) {
        this.id = id;
        this.email = email;
        this.siglafac = siglafac;
    }

    //Getters
    public Long getId(){
        return this.id;
    }

    public String getEmail(){
        return this.email;
    }

    public String getSiglafac(){
        return this.siglafac;
    }
}
