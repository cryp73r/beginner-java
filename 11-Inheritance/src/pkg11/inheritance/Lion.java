/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.inheritance;

/**
 *
 * @author priyanshusingh
 */
public class Lion extends Animal {
    int weight;
    
    public Lion(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    
    @Override
    public void makeSound() {
        System.out.println(this.name + " says Quie Quie");
    }
    
    @Override
    public String toString() {
        return "My name is " + this.name
                + " my weight is " + this.weight + "kg. I am a Lion.";
    }
}
