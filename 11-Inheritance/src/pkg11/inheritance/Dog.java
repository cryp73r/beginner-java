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
public class Dog extends Animal {
    
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public void makeSound() {
        System.out.println(this.name + " says Whof-Whof!");
    }
    
    @Override
    public String toString() {
        return "My name is " + this.name + " and I am a Dog.";
    }
    
}
