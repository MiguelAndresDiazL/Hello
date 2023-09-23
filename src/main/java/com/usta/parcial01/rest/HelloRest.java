package com.usta.parcial01.rest;

import com.usta.parcial01.dto.helloEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class HelloRest {

    @GetMapping("nombre")
    private  String Nombre(){
        String nombre = "Miguel Diaz";
        return "Hola, Mi nombre es "+ (nombre);
    }

}
