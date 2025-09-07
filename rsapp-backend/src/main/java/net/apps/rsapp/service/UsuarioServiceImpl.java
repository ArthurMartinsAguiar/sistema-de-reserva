package net.apps.rsapp.service;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import net.apps.rsapp.dto.UsuarioDTO;
import net.apps.rsapp.entity.Usuario;
import net.apps.rsapp.mapper.UsuarioMapper;
import net.apps.rsapp.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    private final UsuarioRepository usuarioRepository;
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }
    
    @Override
    public UsuarioDTO createUsuario(UsuarioDTO usuarioDTO) {
        Usuario newUsuario = UsuarioMapper.mapToUsuario(usuarioDTO);
        Usuario savedUsuario = usuarioRepository.save(newUsuario);
        return UsuarioMapper.mapToUsuarioDTO(savedUsuario);    
    }

    @Override
    public UsuarioDTO findOrCreateUsuario(String email) {
        Usuario usuario = usuarioRepository.findById(email)
            .orElseGet(() -> usuarioRepository.save(new Usuario(email, "UFU")));
        return UsuarioMapper.mapToUsuarioDTO(usuario);
    }

    @Override
    public List<UsuarioDTO> readUsuarios(){
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios.stream().map((usuario) -> 
            UsuarioMapper.mapToUsuarioDTO(usuario)).collect(Collectors.toList());
    }

}
