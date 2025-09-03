package net.apps.rsapp.dto.UsuarioDTO;

public class UsuarioCreateDTO {
    private String nomeusuario;
    private String siglafac;

    //Constructors
    public UsuarioCreateDTO() {}
    
    public UsuarioCreateDTO(String nomeusuario, String siglafac) {
        this.nomeusuario = nomeusuario;
        this.siglafac = siglafac;
    }

    //Getters
    public String getNomeusuario(){
        return this.nomeusuario;
    }

    public String getSiglafac(){
        return this.siglafac;
    }

}
