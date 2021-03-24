
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Pintor extends JPanel{
	
	private int breed;
	private int horizontal_cursor;
	private int vertical_cursor;
	
	public void SuperSetter(int breed, int horizontal_cursor, int vertical_cursor) {
		this.breed=breed;
		this.horizontal_cursor=horizontal_cursor;
		this.vertical_cursor=vertical_cursor;
	}
	
	@Override 
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		int figure_dimension=40;
		g.setColor(Color.BLACK);
		g.fillRect(horizontal_cursor, vertical_cursor, figure_dimension, figure_dimension);
		/*
		switch(this.breed) {
		case 2:
			g.setColor(Color.BLACK);
			g.fillRect(horizontal_cursor, vertical_cursor, figure_dimension, figure_dimension);
			break;
		case 3:
			g.setColor(Color.WHITE); 
			g.fillRect(horizontal_cursor, vertical_cursor, figure_dimension, figure_dimension);
			break;
		case 1:
			g.setColor(Color.BLUE);
			g.fillOval(horizontal_cursor, vertical_cursor, figure_dimension, figure_dimension);
			break;
		case 0:
			g.setColor(Color.YELLOW);
			g.fillOval(horizontal_cursor, vertical_cursor, figure_dimension, figure_dimension);
			break;
			
		}*/
		
	
	}
	
}
