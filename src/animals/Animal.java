/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author adminBeka
 */
public abstract class Animal {
    
    
    private double size;
    private double weight;
    
    private int numberOfEyes;
    private int numberOfLegs;
    
    private String color;

    public Animal(double size, double weight, int numberOfEyes, int numberOfLegs, String color) {
        this.size = size;
        this.weight = weight;
        this.numberOfEyes = numberOfEyes;
        this.numberOfLegs = numberOfLegs;
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" + "size=" + size + ", weight=" + weight + ", numberOfEyes=" + numberOfEyes + ", numberOfLegs=" + numberOfLegs + ", color=" + color + '}';
    }
    
    
    
}
