
public class Execution {
 
	
	public void action() {
		int level_size = 10;
		Celda[][] laberinto = new Celda[level_size][level_size];	
	
		Creator_of_Array coa = new Creator_of_Array();
		
		coa.action(laberinto);
		
		Mostrador_Laberinto ml = new Mostrador_Laberinto();
		
		ml.action(laberinto);
	}
	

}
