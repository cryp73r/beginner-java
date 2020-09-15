/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.if_else;

/**
 *
 * @author priyanshusingh
 */
public class If_Else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int biggerNum = 10;
        int smallNum = 10;
        if (biggerNum>smallNum) {
            System.out.println(biggerNum + " is Greater than " + smallNum);
        }
        else if (biggerNum<smallNum) {
            System.out.println(biggerNum + " is Smaller than " + smallNum);
        }
        else {
            System.out.println(biggerNum + " is Equal to " + smallNum);
        }
    }
    
}
