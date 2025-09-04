package net.apps.rsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import net.apps.rsapp.dto.UsuarioDTO.UsuarioResponseDTO;

import net.apps.rsapp.entity.Usuario.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query( "SELECT NEW net.apps.rsapp.dto.UsuarioDTO.UsuarioResponseDTO(u.id, u.email, u.siglafac)" +
            "FROM Usuario u WHERE u.email = :email")
    public UsuarioResponseDTO findByEmail(String email);
}
