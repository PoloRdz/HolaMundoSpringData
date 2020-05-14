package mx.com.polordz.thymeleaf.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.var;
import lombok.extern.slf4j.Slf4j;
import mx.com.polordz.thymeleaf.dao.PersonaDAO;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private PersonaDAO personaDAO;

    @GetMapping("/")
    public String inicio(Model model) {        
        log.info("Serving index.html");

        var personas = personaDAO.findAll();
        model.addAttribute("personas", personas);
        return "index";
    }
    
}