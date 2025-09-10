/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author Estudiantes
 */
public class LoteCafe {
    private String varietal;
    private String notas;
    private String origen;
    private int alturaMsnm;
    private String productor;
    private double cantidadLibras;

    public LoteCafe(String varietal, String notas, String origen, int alturaMsnm, String productor, double cantidadLibras) {
        this.varietal = varietal;
        this.notas = notas;
        this.origen = origen;
        this.alturaMsnm = alturaMsnm;
        this.productor = productor;
        this.cantidadLibras = cantidadLibras;
    }
    
    @Override
    public String toString() {
        return "Varietal: "+varietal+"\nNotas: "+notas+"\nOrigen: "+origen+"\nAltura: "+alturaMsnm+"msnm"+"\nProductor: "+productor+"\nCantidad: "+cantidadLibras+"libras";
    }

    
}
