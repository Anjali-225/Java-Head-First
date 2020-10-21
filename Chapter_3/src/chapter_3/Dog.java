/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_3;

/**
 *
 * @author anjali
 */
public class Dog {
    String name;
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";
        
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        
        System.out.print("last don't name is ");
        System.out.println(myDogs[2].name);
        
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x+1;
        }
    }
     void bark() {
        System.out.println(name + " says Ruff!");
    }
    
     void eat() { }
    
     void chaseCat() { }
    
}
