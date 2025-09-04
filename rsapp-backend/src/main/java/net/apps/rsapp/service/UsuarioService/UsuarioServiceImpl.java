package net.apps.rsapp.service.UsuarioService;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import net.apps.rsapp.dto.UsuarioDTO.UsuarioCreateDTO;
import net.apps.rsapp.dto.UsuarioDTO.UsuarioResponseDTO;
import net.apps.rsapp.entity.Usuario.Usuario;
import net.apps.rsapp.repository.UsuarioRepository;
import net.apps.rsapp.mapper.UsuarioMapper.UsuarioMapper;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    private UsuarioRepository usuarioRepository;
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }
    
    @Override
    public UsuarioResponseDTO createUsuario(UsuarioCreateDTO usuarioCreateDTO) {
        Usuario usuario = UsuarioMapper.mapToUsuario(usuarioCreateDTO);
        Usuario savedUsuario = usuarioRepository.save(usuario);
        return UsuarioMapper.mapToUsuarioResponseDTO(savedUsuario);    
    }

    @Override
    public UsuarioResponseDTO readUsuario(Long idusuario) {
        Usuario usuario = usuarioRepository.findById(idusuario)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado"));
        return UsuarioMapper.mapToUsuarioResponseDTO(usuario);
    }

    @Override
    public UsuarioResponseDTO readUsuarioByEmail(String email){
        Usuario usuario = usuarioRepository.findByEmail(email);
        return UsuarioMapper.mapToUsuarioResponseDTO(usuario);
    }

    @Override
    public List<UsuarioResponseDTO> readUsuarios(){
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios.stream().map((usuario) -> 
            UsuarioMapper.mapToUsuarioResponseDTO(usuario)).collect(Collectors.toList());
    };

}
