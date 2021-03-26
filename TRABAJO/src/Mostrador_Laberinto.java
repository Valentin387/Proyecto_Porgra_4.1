import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mostrador_Laberinto extends JPanel{
	
	
	private Celda laberinto[][]=new Celda[10][10];
	private int jx;
	private int jy;
	private int ll;
	public boolean trampa = false;
	
	public void getArrayOnce(Celda laberinto[][]) {
		for(int lines=0; lines<10; lines++) {
			for(int col=0; col<10; col++) {
				this.laberinto[lines][col]= new Celda();
				this.laberinto[lines][col]= laberinto[lines][col];
			}
		}
	}
	
	public void SuperSetter(int jx, int jy, int ll) {
		
		//this.laberinto = laberinto;
		this.jx=jx;
		this.jy=jy;
		this.ll=ll;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		//repaint();
		
		super.paintComponent(g);
		
		int filas;
		int columnas;
		int level_size = 10;
		int horizontal_cursor=0;
		int vertical_cursor=0;
		int figure_dimension=45;
		
		for(filas=0, vertical_cursor=10; filas<level_size ;filas++, vertical_cursor+=50) {
			for(columnas=0,horizontal_cursor=10; columnas <level_size; columnas++,horizontal_cursor+=50) {
				
				if(filas==jy && columnas==jx) {
        				    if(ll == 1){//si tiene la llave se imprime de una forma
        				    	//System.out.print("<@>");
        				    	g.setColor(Color.YELLOW); //YELLOW
        				    	g.fillOval(horizontal_cursor, vertical_cursor, figure_dimension, figure_dimension);
        				    
                			}else{//si no la tiene se imprime de otra
                				//System.out.print("[@]");
                				g.setColor(Color.BLUE); //BLUE
        				    	g.fillOval(horizontal_cursor, vertical_cursor, figure_dimension, figure_dimension);
                			  	
        				}//el jugador está representado por la arroba 
				}else if(laberinto[filas][columnas].isTangible()== true) {
					//System.out.print("[X]");
					if (trampa) {
						g.setColor(Color.RED);
					}else {
						g.setColor(Color.BLACK);
					}
			    	g.fillRect(horizontal_cursor, vertical_cursor, figure_dimension, figure_dimension);
					 
			    	 //tangible = muro;
				}else{
					//System.out.print("[ ]");
					g.setColor(Color.WHITE); //WHITE
			    	g.fillRect(horizontal_cursor, vertical_cursor, figure_dimension, figure_dimension);
				   
			    	 //(in)tangible = (No)muro
				}
			}
			//System.out.print("\n");
			
		}
		
		
	}

	
		
}
	