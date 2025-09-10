/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author Estudiantes
 */
public class Barista implements Observer{
    private String name;
    private String id;
    
    public Barista (String nombre, String id){
        this.name = name;
        this.id=id;
    }

    @Override
    public void update(LoteCafe lote) {
        System.out.println("Notificacion para "+name+"Nuevo lote disponible: \n"+lote);
    }
    
    public String getName(){
        return name;
    }
    
    public String getId(){
        return id;
    }
    
    public String toString (){
        return name+"("+id +")";
    }
}
