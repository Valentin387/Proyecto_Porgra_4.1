
public class Creator_of_Array {
	
	public void action(Celda[][] laberinto, int level) { //Llamo al argumento igual al array original por simplicidad
		
		int level_size = 10;
		
		//System.out.println(pa.loop1(0));
		
		for(int i=0; i<level_size; i++) {
			for(int j=0;  j<level_size; j++) {
				laberinto[i][j] = new Celda(); //es necesario declarar espacio en memoria para cada posición del array
				laberinto[i][j].setTangible(true);
			}

		}
		
		if(level == 1)
		{
			//camino para ganar
			laberinto[0][0].setTangible(false);
			laberinto[1][0].setTangible(false);
			laberinto[2][0].setTangible(false);
			laberinto[2][2].setTangible(false);
			laberinto[3][2].setTangible(false);
			laberinto[2][1].setTangible(false);
			laberinto[3][3].setTangible(false);
			laberinto[3][4].setTangible(false);
			laberinto[4][4].setTangible(false);
			laberinto[5][4].setTangible(false);
			laberinto[6][4].setTangible(false);
			laberinto[6][5].setTangible(false);
			laberinto[6][6].setTangible(false);
			laberinto[5][6].setTangible(false);
			laberinto[4][6].setTangible(false);
			laberinto[4][7].setTangible(false);
			laberinto[4][8].setTangible(false);
			laberinto[5][8].setTangible(false);
			laberinto[6][8].setTangible(false);
			laberinto[7][8].setTangible(false);
			laberinto[8][8].setTangible(false);
			laberinto[9][9].setTangible(false);
			laberinto[9][8].setTangible(false);
			
			
			//caminos falsos
			laberinto[3][0].setTangible(false);
			laberinto[4][0].setTangible(false);
			laberinto[5][0].setTangible(false);
			laberinto[5][1].setTangible(false);
			laberinto[5][2].setTangible(false);
			laberinto[6][2].setTangible(false);
			laberinto[7][2].setTangible(false);
			
			laberinto[7][5].setTangible(false);
			laberinto[8][5].setTangible(false);
			laberinto[8][4].setTangible(false);
			laberinto[8][3].setTangible(false);
			laberinto[8][6].setTangible(false);
			
			laberinto[2][4].setTangible(false);
			laberinto[1][4].setTangible(false);
			laberinto[1][5].setTangible(false);
			laberinto[1][6].setTangible(false);
			laberinto[2][6].setTangible(false);
			laberinto[2][7].setTangible(false);
			laberinto[2][8].setTangible(false);
			laberinto[1][8].setTangible(false);
			
		}
		if(level == 2)
		{
			//camino para ganar
			laberinto[0][0].setTangible(false);
			laberinto[0][1].setTangible(false);
			laberinto[0][2].setTangible(false);
			laberinto[0][3].setTangible(false);
			laberinto[0][4].setTangible(false);
			laberinto[1][4].setTangible(false);
			laberinto[2][4].setTangible(false);
			laberinto[3][4].setTangible(false);
			laberinto[4][4].setTangible(false);
			laberinto[5][4].setTangible(false);
			laberinto[6][4].setTangible(false);
			laberinto[7][4].setTangible(false);
			laberinto[8][4].setTangible(false);
			laberinto[8][5].setTangible(false);
			laberinto[8][6].setTangible(false);
			laberinto[8][7].setTangible(false);
			laberinto[8][8].setTangible(false);
			laberinto[9][8].setTangible(false);
			laberinto[9][9].setTangible(false);
			
			
			//caminos falsos
			laberinto[3][3].setTangible(false);
			laberinto[4][3].setTangible(false);
			laberinto[5][3].setTangible(false);
			laberinto[3][5].setTangible(false);
			laberinto[4][5].setTangible(false);
			laberinto[5][5].setTangible(false);
			
			laberinto[4][2].setTangible(false);
			laberinto[4][1].setTangible(false);
			laberinto[5][1].setTangible(false);
			laberinto[6][1].setTangible(false);
			laberinto[7][1].setTangible(false);
			laberinto[7][2].setTangible(false);
			
			laberinto[4][6].setTangible(false);
			laberinto[4][7].setTangible(false);
			laberinto[4][8].setTangible(false);
			laberinto[5][7].setTangible(false);
			laberinto[6][7].setTangible(false);
			laberinto[3][7].setTangible(false);
			laberinto[2][7].setTangible(false);
			laberinto[1][7].setTangible(false);
			laberinto[1][8].setTangible(false);

		}
		if(level == 3)
		{
			//camino para ganar
			laberinto[0][0].setTangible(false);
			laberinto[0][1].setTangible(false);
			laberinto[0][2].setTangible(false);
			laberinto[1][2].setTangible(false);
			laberinto[1][3].setTangible(false);
			laberinto[1][4].setTangible(false);
			laberinto[1][5].setTangible(false);
			laberinto[0][5].setTangible(false);
			laberinto[0][6].setTangible(false);
			laberinto[0][7].setTangible(false);
			laberinto[0][8].setTangible(false);
			laberinto[1][8].setTangible(false);
			laberinto[2][8].setTangible(false);
			laberinto[3][8].setTangible(false);
			laberinto[4][8].setTangible(false);
			laberinto[4][7].setTangible(false);
			laberinto[4][6].setTangible(false);
			laberinto[4][5].setTangible(false);
			laberinto[5][5].setTangible(false);
			laberinto[6][5].setTangible(false);
			laberinto[7][5].setTangible(false);
			laberinto[8][5].setTangible(false);
			laberinto[9][5].setTangible(false);
			laberinto[9][6].setTangible(false);
			laberinto[9][7].setTangible(false);
			laberinto[9][8].setTangible(false);
			laberinto[9][9].setTangible(false);
			
			
			//caminos falsos
			laberinto[2][2].setTangible(false);
			laberinto[3][2].setTangible(false);
			laberinto[4][2].setTangible(false);
			laberinto[5][2].setTangible(false);
			laberinto[5][1].setTangible(false);
			laberinto[5][0].setTangible(false);
			laberinto[6][2].setTangible(false);
			laberinto[7][2].setTangible(false);
			laberinto[7][1].setTangible(false);
			laberinto[7][0].setTangible(false);
			laberinto[7][3].setTangible(false);
			laberinto[8][3].setTangible(false);
			laberinto[9][3].setTangible(false);
			laberinto[9][4].setTangible(false);
			
			laberinto[5][7].setTangible(false);
			laberinto[6][7].setTangible(false);
			laberinto[7][7].setTangible(false);
						
		}
	}

}

