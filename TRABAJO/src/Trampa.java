import java.util.Random; 

public class Trampa  {

	private int x;
	private int y;
	private boolean active = true;
	
	public void set(Celda laberinto[][]){
		Random rand = new Random();
		boolean seguir = true;
		
		while(seguir) {
		
			int px = rand.nextInt(10);
			int py = rand.nextInt(10);
			
			if(laberinto[py][px].isTangible()== false) {
				this.x = px;
				this.y = py;
				seguir = false;
			}
		}
	}
	
	public void activate(Celda laberinto[][],Jugador pl) {
		if(active) {
			Random rand = new Random();
			boolean seguir = true;
			
			while(seguir) {
			
				int px = rand.nextInt(10);
				int py = rand.nextInt(10);
				
				if(laberinto[py][px].isTangible()== false) {
					pl.setX(px);
					pl.setY(py);
					seguir = false;
					this.active = false;
				}
			}
		}
		}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Trampa(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean getActive(){
		return this.active;
	}
	public void setActive(boolean x){
		this.active = x;
	}
	
	
}