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
public class Tiger extends Mammals{
    
    private String voice;
    
    public Tiger(){
        this(250.00, 230.0, 2, 4, "Orange", true, "ROAR!");
    }
    

    public Tiger(double size, double weight, int numberOfEyes, int numberOfLegs, String color, boolean warm_blooded, String voice) {
        super(size, weight, numberOfEyes, numberOfLegs, color, warm_blooded);
        this.voice = voice;
    }
    
 
}
