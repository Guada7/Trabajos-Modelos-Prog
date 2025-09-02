/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ducks;

import Behaviors.FlyNoWay;
import Behaviors.Squeak;

/**
 *
 * @author Estudiantes
 */
public class TestDucks {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        System.out.println("MallardDuck:");
        mallard.performQuack();
        mallard.performFly();

        Duck rubberDuck = new RubberDuck();
        System.out.println("\nRubberDuck:");
        rubberDuck.performQuack();
        rubberDuck.performFly();

        Duck decoyDuck = new DecoyDuck();
        System.out.println("\nDecoyDuck:");
        decoyDuck.performQuack();
        decoyDuck.performFly();
    }
}
