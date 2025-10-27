
import accesorios.Alarma;
import accesorios.SensorParqueo;
import accesorios.Tapete;
import carro.Carro;
import carro.ZenithAT;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class Main {
    
    public static void main(String[] args){
        Carro miCarro = new ZenithAT();
        
        miCarro = new Alarma(miCarro);
        miCarro = new SensorParqueo(miCarro);
        miCarro = new Tapete(miCarro);
        
        System.out.println("Descripcion: "+miCarro.getDescripcion());
        System.out.println("Precio total: "+miCarro.getPrecio());
       
    }
    
}
