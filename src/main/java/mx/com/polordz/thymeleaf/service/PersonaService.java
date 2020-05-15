package mx.com.polordz.thymeleaf.service;

import java.util.List;

import mx.com.polordz.thymeleaf.domain.Persona;

public interface PersonaService {

    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona findPersona(Persona persona);
    
}