//José Luis Ghersi Moreno... 

package fibonacci_ok;



import java.util.Scanner;
	
public class Fibonacci {
	
	    public static void main(String[] args){
	 
	        Scanner sc = new Scanner(System.in);
	        
	        int numero;
	        int fibonacci1;
	        int fibonacci2;
	        int i;
	  
	        do{
	            System.out.print("Introduce numero mayor que 1: ");
	            numero = sc.nextInt();
	            
	        }while(numero<=1);
	  
	        System.out.println("Los " + numero + " primeros números de la sucesión de Fibonacci son:");                 

	        fibonacci1=1;
	        fibonacci2=1;

	        System.out.print(fibonacci1 + " ");
	        
	        for(i=2;i<=numero;i++){
	        	
	            System.out.print(fibonacci2 + " ");
	            
	            fibonacci2 = fibonacci1 + fibonacci2;
	            fibonacci1 = fibonacci2 - fibonacci1;
	        }
	        
	        System.out.println();
	    }
	}