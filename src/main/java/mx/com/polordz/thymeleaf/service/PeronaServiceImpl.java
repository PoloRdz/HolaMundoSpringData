package mx.com.polordz.thymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.polordz.thymeleaf.dao.PersonaDAO;
import mx.com.polordz.thymeleaf.domain.Persona;

@Service
public class PeronaServiceImpl implements PersonaService {

    @Autowired
    private PersonaDAO personaDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaDAO.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDAO.delete(persona);

    }

    @Override
    @Transactional(readOnly = true)
    public Persona findPersona(Persona persona) {
        return personaDAO.findById(persona.getId()).orElse(null);
    }
    
}