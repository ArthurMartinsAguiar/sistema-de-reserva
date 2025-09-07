package net.apps.rsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.apps.rsapp.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
