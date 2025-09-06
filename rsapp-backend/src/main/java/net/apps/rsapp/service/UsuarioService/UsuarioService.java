package net.apps.rsapp.service.UsuarioService;
import java.util.List;

import net.apps.rsapp.dto.usuarioDTO.UsuarioDTO;

public interface UsuarioService {
    public UsuarioDTO createUsuario(UsuarioDTO usuarioDTO);
    public UsuarioDTO findOrCreateUsuario(String email);
    public List<UsuarioDTO> readUsuarios();
}
