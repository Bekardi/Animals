/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animals;

/**
 *
 * @author milastolbetskaya
 */
public class Swan extends Birds {
    
    private int numWings;

    public Swan(double size, double weight, int numberOfEyes, int numberOfLegs, String color) {
        super(size, weight, numberOfEyes, numberOfLegs, color);
    }

    public Swan(int numWings, double size, double weight, int numberOfEyes, int numberOfLegs, String color) {
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
        return "Swan" +super.toString();
    }
 
    public void flying() {
        System.out.println("The swan flying away from the lake");
    }
}
