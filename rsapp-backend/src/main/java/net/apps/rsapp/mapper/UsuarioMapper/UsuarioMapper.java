package net.apps.rsapp.mapper.UsuarioMapper;

import net.apps.rsapp.dto.usuarioDTO.UsuarioDTO;
import net.apps.rsapp.entity.usuario.Usuario;

/*
 * A classe 'UsuarioMapper' mapeia uma instância da entidade 'Usuario'
 * para sua classe de envio (DTO) e o inverso
 */
public class UsuarioMapper {

    public static UsuarioDTO mapToUsuarioDTO(Usuario usuario) {
        return new UsuarioDTO(
                usuario.getEmail(),
                usuario.getSiglaFac());
    }

    public static Usuario mapToUsuario(UsuarioDTO usuarioDTO) {
        return new Usuario(
                usuarioDTO.getEmail(),
                usuarioDTO.getSiglaFac());
    }
}
