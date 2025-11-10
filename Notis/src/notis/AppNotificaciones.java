/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notis;

/**
 *
 * @author USUARIO
 */
public class AppNotificaciones {
    private SimpleNotificacionFactory factory;

    public AppNotificaciones(SimpleNotificacionFactory factory) {
        this.factory = factory;
    }

    public void enviarNotificacion(String tipo, String mensaje) {
        Notificacion notificacion = factory.crearNotificacion(tipo);
        if (notificacion != null) {
            notificacion.enviar(mensaje);
        } else {
            System.out.println("❌ Tipo de notificación no válido.");
        }
    }
    
}
