package com.example.tarea2.model;

import java.io.Serializable;

public class Automovil implements Serializable {
    private String marca;
    private String modelo;
    private String color;
    private String placa;
    private double precio;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Automovil (){}

    public Automovil(String marca, String modelo, String color, String placa, Double precio){
      this.marca = marca;
      this.modelo = modelo;
      this.color = color;
      this.placa = placa;
      this.precio = precio;
    }
}
