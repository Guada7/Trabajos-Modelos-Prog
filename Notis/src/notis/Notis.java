/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notis;

/**
 *
 * @author USUARIO
 */
public class Notis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SimpleNotificacionFactory factory = new SimpleNotificacionFactory();
        AppNotificaciones app = new AppNotificaciones(factory);

        app.enviarNotificacion("email", "Hola, este es un correo de prueba");
        app.enviarNotificacion("sms", "Mensaje de texto enviado correctamente");
        app.enviarNotificacion("whatsapp", "Mensaje de WhatsApp enviado");
        app.enviarNotificacion("fax", "Esto no debería funcionar");
    }
    
}
