
import java.util.Scanner;
import javax.swing.JFrame;

public class Execution {
 
	
	public void action() throws InterruptedException {
		
		int level_size = 10;

		//creo la pestaña de mensaje
		Mensaje m = new Mensaje();
		
		//creo al jugador
				Jugador pl = new Jugador(0,0);
				System.out.println ("Introduzca el nombre del jugador:");
                String entradaTeclado = "";
                Scanner entradaEscaner = new Scanner (System.in);
                entradaTeclado = entradaEscaner.nextLine ();
		
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
		 if(pl.level == 3)
			 {llave.setX(0);
			 llave.setY(7);}
                
		//creo objeto tipo comando, para recibir comandos AWSD
		Comando ord = new Comando();
		
		//creo objeto tipo mostrador
		Mostrador_Laberinto ml = new Mostrador_Laberinto();
		ml.getArrayOnce(laberinto);
		
		
		//bandera
		boolean terminar = false;
		boolean tieneLlave = false;
		boolean advertencia = true;
		
		KeyListenerTester k = new KeyListenerTester("test");
		
		//creo el frame
		JFrame app = new JFrame("Noob Runner");
		app.addKeyListener(k);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(550,550);
		app.setVisible(true);
		
		
		while(!terminar) {
			
			 //Dibujar mapa
			ml.SuperSetter(pl.getX(), pl.getY(),pl.getll()); 
			ml.repaint();
			app.add(ml);
			
			 //Evalua si llegó a la posicion de la llave oculta
			 if(pl.getX()== llave.getX() && pl.getY() == llave.getY()) {
			    pl.setll(1);
			    if(!tieneLlave)
			    	{System.out.println("\t "+ entradaTeclado + " ha encontrado la llave del piso " + pl.level + ".");}
			    tieneLlave = true;
			 }
			 
			//Evalua si activó alguna trampa
			 if(pl.getX()== trampa1.getX() && pl.getY() == trampa1.getY()) {
				 if(trampa1.getActive())
			    	{System.out.println("\t "+ entradaTeclado + " ha activado una trampa!");
			    	 ml.trampa = true;}
			     trampa1.activate(laberinto,pl);
			    
			 }
			 
			 if(pl.getX()== trampa2.getX() && pl.getY() == trampa2.getY()) {
				 if(trampa2.getActive())
			    	{System.out.println("\t "+ entradaTeclado + " ha activado una trampa!");
			    	 ml.trampa = true;}
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
				 if (pl.level == 3) {
					 System.out.println("\t "+ entradaTeclado + " ha ganado!");
					 m.gana(entradaTeclado);
					 System.exit(0);
				 }
				 else {
					 System.out.println("\t "+ entradaTeclado + " ha completado el piso " + pl.level + ".");
					 m.gana(entradaTeclado);
					 tieneLlave = false;
					 pl.level = pl.level + 1;
					 coa.action(laberinto, pl.level);
					 	ml.getArrayOnce(laberinto);
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
					 if(pl.level == 3) {
						 llave.setX(0);
						 llave.setY(7);
					 }
				 }
			}
			 
			//presentar opción al user
			int motion;
			
			
			motion = ord.action();
			
			if(pl.getX()== 9 && pl.getY() == 9 && advertencia) {
				m.notiene(entradaTeclado);
				advertencia = false;
			}
			
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
			
			k.temp= 100;
			

			//for(int i=0;i<20;i++) {
				//System.out.println("\n");
			//}
			
			Thread.sleep(50);
			ml.trampa = false;
			
		}

	}

}