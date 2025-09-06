package net.apps.rsapp.controller.UsuarioController;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.apps.rsapp.dto.usuarioDTO.UsuarioDTO;
import net.apps.rsapp.service.UsuarioService.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> all(){
        List<UsuarioDTO> usuarios = usuarioService.readUsuarios();
        return new ResponseEntity<>(usuarios, HttpStatus.OK); 
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> createUsuario(@RequestBody UsuarioDTO usuarioCreateDTO ){
        UsuarioDTO savedUsuario = usuarioService.createUsuario(usuarioCreateDTO);
        return new ResponseEntity<>(savedUsuario, HttpStatus.CREATED);
    }
}
