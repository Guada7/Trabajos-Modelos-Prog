/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personaje;

import Hechizo.ExpectoPatronum;

/**
 *
 * @author USUARIO
 */
public class Harry extends Personaje {
    
    public Harry (){
        super("Harry Potter");
        this.hechizo= new ExpectoPatronum();
    }
    
    @Override
    public void lanzarHechizo() {
        hechizo.lanzarHechizo();
    }
}
