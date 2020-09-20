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
public class MyNewClass {
    String name;
    int age;
    
    public MyNewClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public MyNewClass() {
        this.name = "Priyanshu Singh";
        this.age = 20;
    }
    
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
    
    public void message() {
        System.out.println(this.name + " says class Created!");
    }
}
