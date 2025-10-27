/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesorios;

import carro.Carro;

/**
 *
 * @author Estudiantes
 */
public class Alarma extends AccesorioDecorator {
    
    Carro carro;
    
    public Alarma (Carro carro){
        this.carro=carro;
    }

    @Override
    public String getDescripcion() {
        return carro.getDescripcion() + "+ Alarma Starlock";
    }

    @Override
    public double getPrecio() {
        return carro.getPrecio() + 1500000;
    }
    
}
