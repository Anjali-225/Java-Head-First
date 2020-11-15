import javax.swing.*;
import java.awt.*;

public class Button3 {
    public static void main (String[] args) {
        Button3 gui = new Button3();
        gui.go3();
    }

    public void go3() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click This!");
        Font bigFont = new Font("serif", Font.BOLD, 28);
        button.setFont(bigFont);
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
