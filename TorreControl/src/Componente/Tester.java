/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componente;

/**
 *
 * @author USUARIO
 */
public class Tester extends Usuario{
    public Tester(Mediator mediador, String nombre) {
        super(mediador, nombre);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println(nombre + " (Tester) envía: " + mensaje);
        mediador.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibir(String mensaje, String remitente) {
        System.out.println(nombre + " (Tester) recibe de " + remitente + ": " + mensaje);
    }
}
