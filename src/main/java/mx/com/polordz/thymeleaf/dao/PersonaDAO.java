package mx.com.polordz.thymeleaf.dao;

import org.springframework.data.repository.CrudRepository;

import mx.com.polordz.thymeleaf.domain.Persona;

public interface PersonaDAO extends CrudRepository<Persona, Long>{
    
}