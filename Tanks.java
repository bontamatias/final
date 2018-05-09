
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Tanks extends Component {

static JFrame frame;

public void paint(Graphics g) {
    g.drawString("Hello", 200, 50);
}

public Tanks () {

}

public Dimension getPreferredSize () {
    return new Dimension(1000,500);
}

public static void main () {        
    frame = new JFrame("Tanks");
    
    frame.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            frame.dispose();
        }
    });
    
    frame.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent k) {
            if(k.getKeyCode() == k.VK_ESCAPE) {
                frame.dispose();
            }
        } 
    });
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.add(new Tanks());
    
    //frame.setUndecorated(true);
    
    frame.pack();
    frame.setVisible(true);
}
}