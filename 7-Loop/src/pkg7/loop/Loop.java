/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.loop;

/**
 *
 * @author priyanshusingh
 */
public class Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* For Loop */
        int i;
        for (i=1; i<=5; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        /* While Loop */
        int j=0;
        while (j<5) {
            j++;
        }
        System.out.println(j);
        
        /* Do-While Loop */
        int k=0;
        do {
            System.out.println("Hello From Do-While.");
        } while(k!=0);
        System.out.println(k);
    }
    
}
