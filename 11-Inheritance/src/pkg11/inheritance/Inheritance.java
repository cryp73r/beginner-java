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
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal[] myZoo = new Animal[3];
        Lion greg = new Lion("Greg", 2, 200);
        myZoo[0] = greg;
        myZoo[1] = new Dog("Ben", 6);
        myZoo[2] = new Lion("Nikol", 1, 150);
        Farm myLittleFarm = new Farm(myZoo);
        System.out.println(myLittleFarm.toString());
        myLittleFarm.print();
        myLittleFarm.makeSound();
    }
    
}
