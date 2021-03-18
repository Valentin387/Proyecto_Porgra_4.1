import java.util.Scanner;

public class Comando {
	
	public int action() {
		//System.out.println("\n PRESS ENTER ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		//scan.nextLine(); //limpiar el buffer del teclado por si acaso
		
		System.out.println("LEFT(0); DOWN(1); UP(2); RIGHT(3) ");
		System.out.print("OPTION = ");
		int temp=0;
		
		int key = scan.nextInt();

		switch(key) {
		case 0:{
			temp= 0;
			break;
		}
		case  1:{
			temp= 1;
			break;
		}
		case  2:{
			temp= 2;
			break;
		}
		case  3:{
			temp= 3;
			break;
		}
		default:{
			temp=100;
			break;
		}
		}
		
		return temp;
	
		
	}

}
