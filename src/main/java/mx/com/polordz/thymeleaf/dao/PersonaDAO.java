package mx.com.polordz.thymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.polordz.thymeleaf.domain.Persona;

public interface PersonaDAO extends JpaRepository<Persona, Long>{
    
}