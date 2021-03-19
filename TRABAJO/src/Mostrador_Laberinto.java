
public class Mostrador_Laberinto {
	
	//Celda[][] lb;
	
	public void action(Celda laberinto[][] , int jx, int jy, int ll) {
		int filas;
		int columnas;
		int level_size = 10;
		
		for(filas=0; filas<level_size ;filas++) {
			for(columnas=0; columnas < level_size; columnas++) {
				
				if(filas==jy && columnas==jx) {
        				    if(ll == 1){//si tiene la llave se imprime de una forma
					System.out.print("<@>");
                			}else{//si no la tiene se imprime de otra
        				    System.out.print("[@]");
        				}//el jugador está representado por la arroba 
				}else if(laberinto[filas][columnas].isTangible()== true) {
					System.out.print("[X]"); //tangible = muro;
				}else{
					System.out.print("   "); //(in)tangible = (No)muro
				}
			}
			System.out.print("\n");
		}
		
		System.out.println("\nestá en " + jy + " ; " + jx );
		if(ll == 0)
			{System.out.print("llave = " + "NO" + "\n\n");}
		else
			{System.out.print("llave = " + "SI" + "\n\n");}
		
		
	}
		
}
	

	
