/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.functions;

/**
 *
 * @author priyanshusingh
 */
public class Functions {
    
    public static int name(String my_name) {
        System.out.print("My name is " + my_name + ".");
        return 0;
    }
    
    public static int ages(int my_age) {
        int age = my_age;
        return age;
    }
    
    public static void EndOfProgram() {
        System.err.println("End of Program!");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int name = name("Priyanshu SIngh");
        int age = ages(20);
        System.out.println(" Age is " + age + ".");
        EndOfProgram();
    }
    
}
