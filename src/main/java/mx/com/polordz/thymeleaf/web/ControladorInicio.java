package mx.com.polordz.thymeleaf.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.var;
import lombok.extern.slf4j.Slf4j;
import mx.com.polordz.thymeleaf.domain.Persona;
import mx.com.polordz.thymeleaf.service.PersonaService;

@Controller
@Slf4j
public class ControladorInicio {
    //$2a$10$jY.UWysF3vES4eJ6boOlFu1W/b29cnbF7ZkAn5v7TEefYPWZEUHxG
    //$2a$10$ocOahULz/Xi.wtGhCEGnQeSNnrgRhCRWO/aR6.ZvyZv8cbbYz9.zS
    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal User user) {        
        log.info("Serving index.html");

        var personas = personaService.listarPersonas();
        log.info("Logged user: " + user);
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Persona persona){
        log.info("Serving modificar.html");
        
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona, Errors errores){
        if(errores.hasErrors()){
            return "modificar";
        }
        personaService.guardar(persona);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(Persona persona, Model model){
        persona = personaService.findPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Persona persona){
        personaService.eliminar(persona);
        return "redirect:/";
    }
    
}