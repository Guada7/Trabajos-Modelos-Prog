/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carro.boiler;

/**
 *
 * @author Estudiantes
 */
public class Boiler {

    private static Boiler instancia = null;
    
    private boolean vacio;
    private boolean resistenciaEncendida;
    
    private Boiler (){
        vacio=true;
        resistenciaEncendida=false;
    }
    
    public static Boiler getInstancia(){
        if(instancia ==null){
            instancia = new Boiler();
        }
        return instancia;
    }
    
    public void llenar(){
        if(vacio && !resistenciaEncendida){
            vacio=false;
            System.out.println("Boiler lleno con mezcla de chocolate y leche");
        }else{
            System.out.println("No se puede llenar: debe estar vacio y la resitencia apagada");
        }
    }
    
    public void mezclar(){
        if(!vacio && !resistenciaEncendida){
            resistenciaEncendida = true;
            System.out.println("Proceso de mezcla iniciado: resistencia encendida");
        }else{
            System.out.println("No se puede mezclar: el boiler debe estar lleno y resistencia apagada");
        }
    }
    
    public void vaciar(){
        if(!vacio && resistenciaEncendida){
            vacio=true;
            resistenciaEncendida = false;
            System.out.println("Bolier vaciado");
        }else{
            System.out.println("No se puede vaciar: debe no estar vacio y resistncia encendida");
        }
    }
    
    public void estado(){
        System.out.println("Vacio: "+vacio+"|Resistencia encendida: "+resistenciaEncendida);
    }
    
    
        public static void main(String[] args) {
        Boiler boiler = Boiler.getInstancia();
        
        boiler.estado();
        boiler.llenar();
        boiler.mezclar();
        boiler.vaciar();
        boiler.estado();
    }
}
