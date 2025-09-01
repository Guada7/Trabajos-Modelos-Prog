/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ducks;

import Behaviors.FlyWithWings;
import Behaviors.Quack;

/**
 *
 * @author Estudiantes
 */
public class MallardDuck extends Duck{
    public MallardDuck() {
        flyBehavior = new FlyWithWings();    
        quackBehavior = new Quack();         
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
