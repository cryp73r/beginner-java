/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pkgclass;

/**
 *
 * @author priyanshusingh
 */
public class Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyNewClass myProfile = new MyNewClass("Priyanshu Singh", 20);
        System.out.println(myProfile.name + " is " + myProfile.age + " years old.");
        System.out.println("*****OR*****");
        System.out.println(myProfile.getName() + " is " + myProfile.getAge() + " years old.");
        System.out.println("*****OR*****");
        System.out.println(myProfile.name + " is " + myProfile.getAge() + " years old.");
        myProfile.message();
    }
    
}
