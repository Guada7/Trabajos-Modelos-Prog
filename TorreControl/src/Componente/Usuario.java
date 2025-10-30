/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componente;

/**
 *
 * @author USUARIO
 */
public class Usuario {
    protected Mediator mediador;
    protected String nombre;

    public Usuario(Mediator mediador, String nombre) {
        this.mediador = mediador;
        this.nombre = nombre;
    }

    public abstract void enviar(String mensaje);
    public abstract void recibir(String mensaje, String remitente);

    public String getNombre() {
        return nombre;
    }
}
