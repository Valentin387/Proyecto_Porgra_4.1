import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListenerTester extends JFrame implements KeyListener {
	public static int temp;

    public KeyListenerTester(String s) {
        addKeyListener(this);
    }

    public void keyTyped(KeyEvent e) { 	    
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
	    	temp= 0;
	    }

	    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
	    	temp= 3;
	    }

	    if (e.getKeyCode() == KeyEvent.VK_UP) {
	    	temp= 2;
	    }

	    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
	    	temp= 1;
	    }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    	
    }

    public static void main(String[] args) {
        new KeyListenerTester("Key Listener Tester");
    }

	
}