/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package harry_potter7;

import Hechizo.Expelliarmus;
import Hechizo.OculusReparo;
import Hechizo.WingardiumLeviosa;
import Personaje.Harry;
import Personaje.Hermione;
import Personaje.Ron;

/**
 *
 * @author Estudiantes
 */
public class Harry_potter7 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        // Crear personajes con hechizos por defecto
        Hermione hermione = new Hermione(); // WingardiumLeviosa
        Ron ron = new Ron(); // OculusReparo o el que asignaste
        Harry harry = new Harry(); // Expecto Patronum o el que asignaste

        // Lanzar hechizos iniciales
        System.out.println(hermione.getNombre() + " lanza:");
        hermione.lanzarHechizo();

        System.out.println(ron.getNombre() + " lanza:");
        ron.lanzarHechizo();

        System.out.println(harry.getNombre() + " lanza:");
        harry.lanzarHechizo();

        // Cambiar hechizo de Hermione en tiempo de ejecución
        hermione.setHechizo(new Expelliarmus());
        System.out.println(hermione.getNombre() + " cambia de hechizo y lanza:");
        hermione.lanzarHechizo();
        
        ron.setHechizo(new OculusReparo());
        System.out.println(ron.getNombre() + " cambia de hechizo y lanza:");
        ron.lanzarHechizo();
        
        harry.setHechizo(new WingardiumLeviosa());
        System.out.println(harry.getNombre() + " cambia de hechizo y lanza:");
        harry.lanzarHechizo();
    }
    
}
