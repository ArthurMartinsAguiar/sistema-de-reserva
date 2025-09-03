package net.apps.rsapp.dto.UsuarioDTO;

public class UsuarioResponseDTO {
     private Long idusuario;
    private String nomeusuario;
    private String siglafac;

    //Constructors
    public UsuarioResponseDTO() {}
    
    public UsuarioResponseDTO(Long idusuario, String nomeusuario, String siglafac) {
        this.idusuario = idusuario;
        this.nomeusuario = nomeusuario;
        this.siglafac = siglafac;
    }

    //Getters
    public Long getIdusuario(){
        return this.idusuario;
    }

    public String getNomeusuario(){
        return this.nomeusuario;
    }

    public String getSiglafac(){
        return this.siglafac;
    }
}
