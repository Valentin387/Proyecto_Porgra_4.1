import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mostrador_Laberinto{
	
	//Celda[][] lb;
	
	public void action(JFrame app, Celda laberinto[][] , int jx, int jy, int ll) {
		int filas;
		int columnas;
		int level_size = 10;
		int horizontal_cursor=0;
		int vertical_cursor=0;
		
		Pintor pin = new Pintor();
		
		for(filas=0, vertical_cursor=0; filas<5 ;filas++, vertical_cursor+=45) {
			for(columnas=0,horizontal_cursor=0; columnas < 5; columnas++,horizontal_cursor+=45) {
				
				if(filas==jy && columnas==jx) {
        				    if(ll == 1){//si tiene la llave se imprime de una forma
      
        				    	pin.SuperSetter(0,horizontal_cursor,vertical_cursor);  
        				    	//app.add(pin);
                			}else{//si no la tiene se imprime de otra

                				pin.SuperSetter(1,horizontal_cursor,vertical_cursor);  
        				    	//app.add(pin);
        				}//el jugador está representado por la arroba 
				}else if(laberinto[filas][columnas].isTangible()== true) {

					pin.SuperSetter(2,horizontal_cursor,vertical_cursor);  
			    	//app.add(pin); //tangible = muro;
				}else{
		
					pin.SuperSetter(3,horizontal_cursor,vertical_cursor);   
			    	//app.add(pin); //(in)tangible = (No)muro
				}
			}
			System.out.print("\n");
		}
		
		app.add(pin); 
		
		System.out.println("\nestá en " + jy + " ; " + jx );
		if(ll == 0)
			{System.out.print("llave = " + "NO" + "\n\n");}
		else
			{System.out.print("llave = " + "SI" + "\n\n");}
		
		
	}
	
	
		
}
	

	
