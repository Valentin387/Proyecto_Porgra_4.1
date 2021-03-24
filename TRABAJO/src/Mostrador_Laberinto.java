import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mostrador_Laberinto extends JPanel{
	
	private JFrame app;
	private Celda laberinto[][];
	private int jx;
	private int jy;
	private int ll;
	
	public void SuperSetter(JFrame app, Celda laberinto[][], int jx, int jy, int ll) {
		this.app=app;
		this.laberinto = laberinto;
		this.jx=jx;
		this.jy=jy;
		this.ll=ll;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		repaint();
		
		super.paintComponent(g);
		
		int filas;
		int columnas;
		int level_size = 10;
		int horizontal_cursor=0;
		int vertical_cursor=0;
		int figure_dimension=45;
		
		for(filas=0, vertical_cursor=0; filas<level_size ;filas++, vertical_cursor+=50) {
			for(columnas=0,horizontal_cursor=0; columnas <level_size; columnas++,horizontal_cursor+=50) {
				
				if(filas==jy && columnas==jx) {
        				    if(ll == 1){//si tiene la llave se imprime de una forma
        				    	g.setColor(Color.YELLOW); //YELLOW
        				    	g.fillOval(horizontal_cursor, vertical_cursor, figure_dimension, figure_dimension);
        				    
                			}else{//si no la tiene se imprime de otra
                				g.setColor(Color.BLUE); //BLUE
        				    	g.fillOval(horizontal_cursor, vertical_cursor, figure_dimension, figure_dimension);
                			  	
        				}//el jugador está representado por la arroba 
				}else if(laberinto[filas][columnas].isTangible()== true) {
					g.setColor(Color.BLACK); //BLACK
			    	g.fillRect(horizontal_cursor, vertical_cursor, figure_dimension, figure_dimension);
					 
			    	 //tangible = muro;
				}else{
					g.setColor(Color.WHITE); //WHITE
			    	g.fillRect(horizontal_cursor, vertical_cursor, figure_dimension, figure_dimension);
				   
			    	 //(in)tangible = (No)muro
				}
			}
			
		}
		
		
	}

	
		
}
	

	
