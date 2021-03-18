
public class Mostrador_Laberinto {
	
	//Celda[][] lb;
	
	
	public void action(Celda laberinto[][] , int jx, int jy) {
		int filas;
		int columnas;
		int level_size = 10;
		
		for(filas=0; filas<level_size ;filas++) {
			for(columnas=0; columnas < level_size; columnas++) {
				
				if(filas==jy && columnas==jx) {
					System.out.print("[@]"); //el jugador est� representado por la arroba 
				}else if(laberinto[filas][columnas].isTangible()== true) {
					System.out.print("[X]"); //tangible = muro;
				}else {
					System.out.print("[ ]"); //(in)tangible = (No)muro
				}
			}
			System.out.print("\n");
		}
		
		System.out.println("\nEl juegador est� en " + jy + " ; " + jx + "\n\n");
		
	}
		
}
	

