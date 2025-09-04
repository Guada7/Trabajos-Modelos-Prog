/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personaje;

import Hechizo.WingardiumLeviosa;

/**
 *
 * @author Estudiantes
 */
public class Hermione extends Personaje {
    
    public Hermione (){
        super("Hermione Granger");
        this.hechizo= new WingardiumLeviosa();
    }
    
    @Override
    public void lanzarHechizo() {
        hechizo.lanzarHechizo();
    }
    
}
