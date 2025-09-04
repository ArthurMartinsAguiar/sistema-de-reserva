package net.apps.rsapp.service.UsuarioService;
import java.util.List;

import net.apps.rsapp.dto.UsuarioDTO.UsuarioCreateDTO;
import net.apps.rsapp.dto.UsuarioDTO.UsuarioResponseDTO;

public interface UsuarioService {
    public UsuarioResponseDTO createUsuario(UsuarioCreateDTO usuarioCreateDTO);
    public UsuarioResponseDTO readUsuario(Long idusuario);
    public UsuarioResponseDTO readUsuarioByEmail(String email);
    public List<UsuarioResponseDTO> readUsuarios();
}
