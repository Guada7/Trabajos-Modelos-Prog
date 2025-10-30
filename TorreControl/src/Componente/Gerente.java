/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componente;

/**
 *
 * @author USUARIO
 */
public class Gerente extends Usuario{
     public Gerente(Mediator mediador, String nombre) {
        super(mediador, nombre);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println(nombre + " (Gerente) envía: " + mensaje);
        mediador.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibir(String mensaje, String remitente) {
        System.out.println(nombre + " (Gerente) recibe de " + remitente + ": " + mensaje);
    }
}
