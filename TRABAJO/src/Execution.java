
import java.util.Scanner;
public class Execution {
 
	
	public void action() {
		int level_size = 10;
		
		//creo al jugador
				Jugador pl = new Jugador(0,0);
				System.out.println ("Introduzca el nombre del jugador:");
                String entradaTeclado = "";
                Scanner entradaEscaner = new Scanner (System.in);
                entradaTeclado = entradaEscaner.nextLine ();
                for(int i=0;i<20;i++) {
    				System.out.println("\n");
    			}
		
		//selecciono el nivel
		pl.level = 1;
		
		//creo el entorno
		Celda[][] laberinto = new Celda[level_size][level_size];
		
		//especifico las características del entorno
		Creator_of_Array coa = new Creator_of_Array();
		coa.action(laberinto, pl.level);
		
		Trampa trampa1 = new Trampa(10,10);
		trampa1.set(laberinto);
		
		Trampa trampa2 = new Trampa(10,10);
		trampa2.set(laberinto);
		
                
		//creamos la llave
		Llave llave = new Llave(9,9);
		 if(pl.level == 1) 
		 	{llave.setX(8);
			 llave.setY(1);}
		 if(pl.level == 2) 
		 	{llave.setX(7);
			 llave.setY(6);}
                
		//creo objeto tipo comando, para recibir comandos AWSD
		Comando ord = new Comando();
		
		//creo objeto tipo mostrador
		Mostrador_Laberinto ml = new Mostrador_Laberinto();
		
		
		
		//bandera
		boolean terminar=false;
		boolean tieneLlave = false;
		
		while(!terminar) {
			
			 //Dibujar mapa
			 ml.action(laberinto, pl.getX(), pl.getY(),pl.getll());
			
			 //Evalua si llegó a la posición de la llave oculta
			 if(pl.getX()== llave.getX() && pl.getY() == llave.getY()) {
			    pl.setll(1);
			    if(!tieneLlave)
			    	{System.out.println("\t "+ entradaTeclado + " ha encontrado la llave del piso " + pl.level + ".");}
			    tieneLlave = true;
			 }
			 
			//Evalua si activó alguna trampa
			 if(pl.getX()== trampa1.getX() && pl.getY() == trampa1.getY()) {
				 if(trampa1.getActive())
			    	{System.out.println("\t "+ entradaTeclado + " ha activado una trampa!");}
			     trampa1.activate(laberinto,pl);
			    
			 }
			 
			 if(pl.getX()== trampa2.getX() && pl.getY() == trampa2.getY()) {
				 if(trampa2.getActive())
			    	{System.out.println("\t "+ entradaTeclado + " ha activado una trampa!");}
			     trampa2.activate(laberinto,pl);
			 }
		 
			 //evalua si el jugador tiene un 1 en la
			 //variable que identifica tener la llave
			 //y en ese caso mueve la llave con el jugador
			 if(pl.getll()==1){
			     llave.setX(pl.getX());
			     llave.setY(pl.getY());
			 }
			 
			 //evalua si se llevó la llave hasta la salida
			 //en caso de que el jugador  no llegue con la llave no gana
			 if(llave.getX()==9 && llave.getY()==9) {
				 if (pl.level == 2) {
					 System.out.println("\t "+ entradaTeclado + " ha ganado!");
					 System.exit(0);
				 }
				 else {
					 System.out.println("\t "+ entradaTeclado + " ha completado el piso " + pl.level + ".");
					 tieneLlave = false;
					 pl.level = pl.level + 1;
					 coa.action(laberinto, pl.level);
					 trampa1.set(laberinto);
					 trampa1.setActive(true);
					 trampa2.set(laberinto);
					 trampa2.setActive(true);
					 pl.setX(0);
					 pl.setY(0);
					 pl.setll(0);
					 if(pl.level == 2) {
						 llave.setX(7);
						 llave.setY(6);
					 }
				 }
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
				break;
			}
			
			//hacer solicitud de acceso a la nueva celda
			if(pl.getX()<0 || pl.getX()>9 || pl.getY()<0 || pl.getY()>9 || laberinto[pl.getY()][pl.getX()].isTangible()) {
				pl.setX(tempx);
				pl.setY(tempy);
				
			}
			
			

			for(int i=0;i<20;i++) {
				System.out.println("\n");
			}
			
			
		}

	}
	

}
