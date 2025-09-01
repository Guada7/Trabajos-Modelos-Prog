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
public class DecoyDuck extends Duck{
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();    
        quackBehavior = new Squeak();         
    }
    
    @Override
    public void display() {
        System.out.println("I'm a Decoy duck");
    }
}
