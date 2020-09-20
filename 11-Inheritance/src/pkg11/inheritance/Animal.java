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
public class Animal {
    String name;
    int age;
    
    /*GETTERS and SETTERS*/
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void makeSound() {
        System.out.println("This method should be overridden in Dog, Cat or Lion Class.");
    }
}
