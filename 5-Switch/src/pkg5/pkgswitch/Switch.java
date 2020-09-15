/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkgswitch;

/**
 *
 * @author priyanshusingh
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int switchedInt = 5;
        int result = 0;
        switch (switchedInt) {
            case 0:
                result = 10*0;
                break;
            case 5:
                result = 10*5;
                break;
            default:
                result = 0;
        }
        System.out.println("Result is " + result);
    }
    
}
