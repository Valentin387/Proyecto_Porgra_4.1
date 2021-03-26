import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Mensaje
{
 
  public static void gana(String entradaTeclado)
  {
    
    
    // create a jframe
    JFrame frame = new JFrame("JOptionPane mensaje example");

    // show a joptionpane dialog using showMessageDialog
    JOptionPane.showMessageDialog(frame,
        "Felicidades "+ entradaTeclado + ", has superado el nivel.",
        "Nivel Finalizado",
        JOptionPane.INFORMATION_MESSAGE);
    
  }
  
  public static void notiene(String entradaTeclado)
  {
    
    
    // create a jframe
    JFrame frame = new JFrame("JOptionPane mensaje example");

    // show a joptionpane dialog using showMessageDialog
    JOptionPane.showMessageDialog(frame,
         entradaTeclado + ", recuerda que para salir del laberinto debes encontrar la llave primero.",
        "Informacion",
        JOptionPane.INFORMATION_MESSAGE);
    
  }
}
