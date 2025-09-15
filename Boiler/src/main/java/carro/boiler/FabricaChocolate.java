/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carro.boiler;

/**
 *
 * @author Estudiantes
 */
public class FabricaChocolate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boiler boiler = Boiler.getInstancia();
        
        boiler.estado();
        boiler.llenar();
        boiler.llenar();
        boiler.mezclar();
        boiler.mezclar();
        boiler.vaciar();
        boiler.estado();
    }
    
}
