package net.apps.rsapp.mapper.UsuarioMapper;

import net.apps.rsapp.dto.UsuarioDTO.UsuarioCreateDTO;
import net.apps.rsapp.dto.UsuarioDTO.UsuarioResponseDTO;
import net.apps.rsapp.entity.Usuario;

/*
 * A classe 'UsuarioMapper' mapeia uma instância da entidade 'Usuario'
 * para sua classe de envio (DTO) e o inverso
 */
public class UsuarioMapper {

    public static UsuarioCreateDTO mapToUsuarioCreateDTO(Usuario usuario){
        return new UsuarioCreateDTO(
            usuario.getNomeusuario(),
            usuario.getSiglafac()
        );
    }

    public static UsuarioResponseDTO mapToUsuarioResponseDTO(Usuario usuario){
        return new UsuarioResponseDTO(
            usuario.getIdusuario(),
            usuario.getNomeusuario(),
            usuario.getNomeusuario()
        );
    }

    public static Usuario mapToUsuario(UsuarioCreateDTO usuarioCreateDTO){
        return new Usuario(
            usuarioCreateDTO.getNomeusuario(),
            usuarioCreateDTO.getSiglafac()
        );
    }
}
