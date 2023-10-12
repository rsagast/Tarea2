package com.example.tarea2.controller;

import com.example.tarea2.model.Automovil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class AutomovilControler {

    @GetMapping("automoviles")
    public ResponseEntity<List<Automovil>> GetAutomoviles(){
        Automovil a1 = new Automovil("Toyota","Corolla","Rojo","100",100.00);
        Automovil a2 = new Automovil("Renault","Duster","Gris","200",200.00);
        Automovil a3 = new Automovil("Mazda","3","Blanco","300",300.00);
        Automovil a4 = new Automovil("Nissan","Sentra","Negro","400",400.00);
        Automovil a5 = new Automovil("Kia","Sportage","Verde","500",500.00);
        return new ResponseEntity<>(List.of(a1,a2,a3,a4,a5), HttpStatus.OK);
    }
}
