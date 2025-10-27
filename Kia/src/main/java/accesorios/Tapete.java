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
public class Tapete extends AccesorioDecorator {
    
    Carro carro;
    
    public Tapete (Carro carro){
        this.carro=carro;
    }

    @Override
    public String getDescripcion() {
        return carro.getDescripcion() + "+ Tapete 3 piezas ";
    }

    @Override
    public double getPrecio() {
        return carro.getPrecio() + 92000;
    }
    
    
}
