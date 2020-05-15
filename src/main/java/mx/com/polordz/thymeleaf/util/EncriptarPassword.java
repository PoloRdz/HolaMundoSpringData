package mx.com.polordz.thymeleaf.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.var;

public class EncriptarPassword {
    public static void main(String[] args) {
        var password = "Amonos123";
        System.out.println(encriptarPassword(password));
    }

    public static encriptarPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}