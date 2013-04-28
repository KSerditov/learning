/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kserditov;

/**
 *
 * @author kserditov
 */
public class Bicycle {
    
    int cadence;
    int gear;
    int speed;
    
    void changeCadence (int newValue)
    {
        cadence = newValue;   
    }
    
    void gearUp()
    {
        gear = gear + 1;
    }
    
    void gearDown()
    {
        gear = gear - 1;
    }
    
    void speedUp(int increment) 
    {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) 
    {
         speed = speed - decrement;
    }
    
    void printState()
    {
        System.out.println("\nCadence: " + cadence + "\nGear: " + gear + "\nSpeed: " + speed);
    }
}
