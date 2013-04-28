/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kserditov;

/**
 *
 * @author kserditov
 */
public class BicycleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        
        bike1.changeCadence(40);
        bike1.gearUp();
        bike1.gearUp();
        bike1.speedUp(30);
        bike1.printState();
        
        bike2.changeCadence(20);
        bike2.gearUp();
        bike2.gearUp();
        bike2.gearDown();
        bike2.speedUp(15);
        bike2.printState();
    }
}
