/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personaje;

import Hechizo.Expelliarmus;
import Hechizo.WingardiumLeviosa;

/**
 *
 * @author USUARIO
 */
public class Ron extends Personaje {
    public Ron (){
        super("Ron Weasley");
        this.hechizo= new Expelliarmus();
    }
    
    @Override
    public void lanzarHechizo() {
        hechizo.lanzarHechizo();
    }
}
