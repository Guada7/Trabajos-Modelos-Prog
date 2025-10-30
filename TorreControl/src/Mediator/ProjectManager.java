/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator;
import Componente.Desarrollador;
import Componente.Gerente;
import Componente.ProjectManagerUsuario;
import Componente.Tester;
import Componente.Usuario;
import java.util.*;
/**
 *
 * @author USUARIO
 */
public class ProjectManager implements Mediator{
    private List<Usuario> usuarios;

    public ProjectManager() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario remitente) {
        System.out.println("\n[Project Manager] Recibe mensaje de " + remitente.getNombre() + ": \"" + mensaje + "\"");
        System.out.println("[Project Manager] Procesando envío...");

        for (Usuario u : usuarios) {
            if (u == remitente) continue;

            
            if (remitente instanceof Desarrollador) {
                
                if (u instanceof Tester || u instanceof ProjectManagerUsuario) {
                    u.recibir(mensaje, remitente.getNombre());
                }
            } 
            else if (remitente instanceof Tester) {
                
                if (u instanceof Desarrollador || u instanceof ProjectManagerUsuario) {
                    u.recibir(mensaje, remitente.getNombre());
                }
            } 
            else if (remitente instanceof Gerente) {
                
                u.recibir(mensaje, remitente.getNombre());
            } 
            else if (remitente instanceof ProjectManagerUsuario) {
                
                if (u instanceof Gerente) {
                    u.recibir(mensaje, remitente.getNombre());
                }
            }
        }
    }
}
