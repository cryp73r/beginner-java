/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.sumofarray;

/**
 *
 * @author priyanshusingh
 */
public class SumOfArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] inputArray = {10, 20, 30, 40, 50, 60, 70, 80, 90 ,95, 100};
        int i, sum=0;
        for (i=0; i<inputArray.length; i++) {
            sum = sum + inputArray[i];
        }
        System.out.println("Sum of Array: " + sum);
        System.out.println("Average of Array Elements: " + (sum/inputArray.length));
    }
    
}
