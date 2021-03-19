
public class Jugador  {

	private int x;
	private int y;
	//variable para saber si tiene la llave 1=si
	private int ll = 0;
	public int level = 1;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getll() {
	    return ll;
	}
	public void setll(int ll) {
		this.ll = ll;
	}
	
	public Jugador(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
}