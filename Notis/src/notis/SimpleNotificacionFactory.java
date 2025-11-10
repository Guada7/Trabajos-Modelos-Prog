/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notis;

/**
 *
 * @author USUARIO
 */
public class SimpleNotificacionFactory {
    
    public Notificacion crearNotificacion(String tipo) {
        Notificacion notificacion = null;

        if (tipo.equalsIgnoreCase("email")) {
            notificacion = new EmailNotificacion();
        } else if (tipo.equalsIgnoreCase("sms")) {
            notificacion = new SMSNotificacion();
        } else if (tipo.equalsIgnoreCase("whatsapp")) {
            notificacion = new WhatsAppNotificacion();
        }

        return notificacion;
    }
}
