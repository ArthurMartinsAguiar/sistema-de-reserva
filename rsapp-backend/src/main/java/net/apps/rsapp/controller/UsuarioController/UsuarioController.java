package net.apps.rsapp.controller.UsuarioController;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.apps.rsapp.dto.UsuarioDTO.UsuarioCreateDTO;
import net.apps.rsapp.dto.UsuarioDTO.UsuarioResponseDTO;
import net.apps.rsapp.service.UsuarioService.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> all(){
        List<UsuarioResponseDTO> usuarios = usuarioService.readUsuarios();
        return new ResponseEntity<>(usuarios, HttpStatus.OK); 
    }

    @GetMapping("/{idusuario}")
    public ResponseEntity<UsuarioResponseDTO> one(@PathVariable Long idusuario){
        UsuarioResponseDTO usuario = usuarioService.readUsuario(idusuario);
        return new ResponseEntity<>(usuario, HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> createUsuario(@RequestBody UsuarioCreateDTO usuarioCreateDTO ){
        UsuarioResponseDTO savedUsuario = usuarioService.createUsuario(usuarioCreateDTO);
        return new ResponseEntity<>(savedUsuario, HttpStatus.CREATED);
    }
}
