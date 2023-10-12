package com.example.tarea2.controller;

import com.example.tarea2.model.Producto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ProductoController {

    @GetMapping ("productos")
    public ResponseEntity<List<Producto>> GetProductos(){
        Producto p1 = new Producto(1,"Producto 1", "Uno",100.00,1);
        Producto p2 = new Producto(2,"Producto 2", "Dos",200.00,2);
        return new ResponseEntity<>(List.of(p1,p2), HttpStatus.OK);
    }
}
