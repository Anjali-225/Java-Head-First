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
public class Chapter_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("I Rule!");
        System.out.println("The World");
        
        int x = 3;
        String name = "Dirk";
        x = x * 17;
        System.out.println("x is " + x);
        double d = Math.random();
        // this is a comment
        
        while (x > 12) {
            x = x - 1;
        }
        
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("x is now" + i);
        }
        
        if (x == 10) {
            System.out.println("x must be 10");;
        } else {
            System.out.println("x isn't 10");
        }
        if ((x < 3) & (name.equals("Dirk"))) {
            System.out.println("Gently");
        }
        System.out.println("This line runs no matter what");
    }
    
}
