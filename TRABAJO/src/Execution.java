
public class Execution {
 
	
	public void action() {
		int level_size = 10;
		
		//creo el entorno
		Celda[][] laberinto = new Celda[level_size][level_size];	
		//especifico las características del entorno
		Creator_of_Array coa = new Creator_of_Array();
		coa.action(laberinto);
		
		//creo al jugador
		Jugador pl = new Jugador(0,0);
		
		//creo objeto tipo comando, para recibir comandos AWSD
		Comando ord = new Comando();
		
		//creo objeto tipo mostrador
		Mostrador_Laberinto ml = new Mostrador_Laberinto();
		
		//bandera
		boolean terminar=false;
		
		while(!terminar) {
			
			//Dibujar mapa
			ml.action(laberinto, pl.getX(), pl.getY());
			
			if(pl.getX()==9 && pl.getY()==9) {
				System.out.println("\t Victoria");
				System.exit(0);
			}
			
			//presentar opción al user
			int motion;
			
			motion = ord.action();
			
			//guardar posición actual del jugador
			int tempx=pl.getX();
			int tempy=pl.getY();
			
			switch(motion) {
			case 0:
				pl.setX(pl.getX()-1);
				break;
			case 1:
				pl.setY(pl.getY()+1);
				break;
			case 2:
				pl.setY(pl.getY()-1);
				break;
			case 3:
				pl.setX(pl.getX()+1);
				break;
			default:
				//System.out.println("No valid \n"); //it falls here
			}
			
			//hacer solicitud de acceso a la nueva celda
			if(pl.getX()<0 || pl.getX()>9 || pl.getY()<0 || pl.getY()>9 || laberinto[pl.getY()][pl.getX()].isTangible()) {
				pl.setX(tempx);
				pl.setY(tempy);
				
			}

			for(int i=0;i<3;i++) {
				System.out.println("\n");
			}
			
		}

	}
	

}
