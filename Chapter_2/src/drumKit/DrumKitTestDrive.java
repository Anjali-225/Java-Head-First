/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drumKit;

/**
 *
 * @author anjali
 */
public class DrumKitTestDrive {
    public static void main(String [] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.playTopHat();
        
        d.snare = false;
        
        if (d.snare == true) {
            d.playSnare();
            d.playTopHat();
        }
    }
    
}
