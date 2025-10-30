/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Mediator;

/**
 *
 * @author USUARIO
 */
import java.util.*;

interface Mediator {
    void enviarMensaje(String mensaje, Usuario remitente);
    void registrarUsuario(Usuario usuario);
}
