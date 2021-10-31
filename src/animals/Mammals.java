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
public abstract class Mammals extends Animal{
    
    private boolean warm_blooded;
    
    public Mammals(double size, double weight, int numberOfEyes, int numberOfLegs, String color, boolean warm_blooded) {
        super(size, weight, numberOfEyes, numberOfLegs, color);
        this.warm_blooded = warm_blooded;
    }

    public boolean isWarm_blooded() {
        return warm_blooded;
    }

    public void setWarm_blooded(boolean warm_blooded) {
        this.warm_blooded = warm_blooded;
    }
    
    
    
}
