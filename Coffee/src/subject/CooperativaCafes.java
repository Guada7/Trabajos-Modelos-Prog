/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subject;

/**
 *
 * @author Estudiantes
 */
import java.util.ArrayList;
import java.util.List;
import observer.LoteCafe;
import observer.Observer;

public class CooperativaCafes implements Subject {
    private List<Observer> baristas;

    public CooperativaCafes() {
        baristas = new ArrayList<>();
    }

    @Override
    public void notifyObserver(LoteCafe lote) {
        for (Observer barista : baristas) {
            barista.update(lote);
        }
    }

    public void registrarLote(LoteCafe lote) {
        // Aquí podrías almacenar el lote si lo deseas
        notifyObserver(lote);
    }

    @Override
    public void registerObserver(Observer o) {
        baristas.add(o);
        System.out.println("Barista agregado");
    }

    @Override
    public void removeObserver(Observer o) {
        baristas.remove(o);
        System.out.println("Barista eliminado");
    }


}

