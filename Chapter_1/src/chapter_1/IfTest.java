/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_1;

/**
 *
 * @author anjali
 */
public class IfTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 3;
        if (x == 3) {
            System.out.println("x must be 3");
        }
        System.out.println("This runs no matter what");
        
        int y = 4;
        if (y == 3) {
            System.out.println("y must be 3");
        } else {
            System.out.println("This runs no matter what");
        }        
    }    
}
