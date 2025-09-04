/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personaje;

import Hechizo.Hechizo;

/**
 *
 * @author Estudiantes
 */
public abstract class Personaje {
    protected Hechizo hechizo;
    protected String nombre;
    
    public Personaje (String nombre){
        this.nombre = nombre;
    }
    
    public abstract void lanzarHechizo();
    
    public void setHechizo(Hechizo hechizo){
        this.hechizo= hechizo;
    }
    
    public String getNombre(){
        return nombre;
    }
}
