package mx.com.polordz.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String inicio(Model model) {        
        log.info("Serving index.html");

        return "index";
    }
    
}