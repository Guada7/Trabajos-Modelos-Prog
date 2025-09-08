/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Display;

import Observer.Observer;
import Subject.Subject;

/**
 *
 * @author Estudiantes
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
  private float temperature;
  private float humidity;
  private Subject weatherData;
  
  public CurrentConditionsDisplay(Subject weatherData){
      this.weatherData=weatherData;
      weatherData.registerObserver(this);
  }
  
  @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    
   @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "°C and " + humidity + "% humidity");
    }
}
