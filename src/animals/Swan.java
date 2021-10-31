/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animals;

import animals.interfaces.Herbivores;

/**
 *
 * @author milastolbetskaya
 */
public class Swan extends Birds implements Herbivores {
    
    private int numWings;

    public Swan() {
        this(32, 55, 2, 2, "White",2);
        
    }

    public Swan( double size, double weight, int numberOfEyes, int numberOfLegs, String color, int numWings) {
        super(size, weight, numberOfEyes, numberOfLegs, color);
        this.numWings = numWings;
    }

  

    public int getNumWings() {
        return numWings;
    }

    public void setNumWings(int numWings) {
        this.numWings = numWings;
    }

    @Override
    public String toString() {
        return "Swan{" + "numWings=" + numWings + '}';
    }

  
 
    public void flying() {
        System.out.println("The swan flying away from the lake");
    }
}
