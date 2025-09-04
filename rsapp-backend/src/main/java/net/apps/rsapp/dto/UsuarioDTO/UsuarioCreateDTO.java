package net.apps.rsapp.dto.UsuarioDTO;

public class UsuarioCreateDTO {
    private String email;
    private String siglafac;

    //Constructors
    public UsuarioCreateDTO() {}
    
    public UsuarioCreateDTO(String email, String siglafac) {
        this.email = email;
        this.siglafac = siglafac;
    }

    //Getters
    public String getEmail(){
        return this.email;
    }

    public String getSiglafac(){
        return this.siglafac;
    }

}
