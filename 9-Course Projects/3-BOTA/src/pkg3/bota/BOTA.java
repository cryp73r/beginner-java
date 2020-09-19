/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.bota;

/**
 *
 * @author priyanshusingh
 */
public class BOTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] firstArray = {10, 4, 5, 6, 89, 2, 6, 90};
        int[] secondArray = {5, 40, 3, 98, 23, 45, 56};
        int fir=0;
        int sec=0;
        System.out.print("First Array: ");
        for (int i=0; i<firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
            if (fir<=firstArray[i]) {
                fir = firstArray[i];
            }
        }
        System.out.println();
        System.out.print("Second Array: ");
        for (int i=0; i<secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
            if (sec<=secondArray[i]) {
                sec = secondArray[i];
            }
        }
        System.out.println();
        if (fir>sec) {
            System.out.println("Biggest Number is in First Array " + fir);
        }
        else if (fir<sec) {
            System.out.println("Biggest Number is in Second Array " + sec);
        }
        else {
            System.out.println("Biggest Number is in Both Array " + fir);
        }
    }
    
}
