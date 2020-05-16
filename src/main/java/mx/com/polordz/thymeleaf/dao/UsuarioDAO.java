package mx.com.polordz.thymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.polordz.thymeleaf.domain.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Long>{

    Usuario findByUsername(String username);
    
}