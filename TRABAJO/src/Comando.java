import java.util.Scanner;

public class Comando {
	
	public int action() {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		
		System.out.println("LEFT(A); DOWN(S); UP(W); RIGHT(D) ");
		System.out.print("OPTION = ");
		int temp=0;
		
        Scanner sc = new Scanner (System.in);
        char eTeclado = sc.next().charAt(0);
        
        int key = 10;
        
        if(eTeclado == 'w')
        	{key = 2;}
        if(eTeclado == 'a')
    		{key = 0;}
        if(eTeclado == 's')
    		{key = 1;}
        if(eTeclado == 'd') 
    		{key = 3;}
  

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