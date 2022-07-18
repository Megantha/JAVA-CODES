package module1;
import java.util.Scanner;

public class Arithmaticcalculator 
{
	public static void main(String[] args) {
		
	        Scanner number = new Scanner(System.in);
	        
			System.out.println("Enter the number 1 :");
	    	int a= number.nextInt();
	    	
		    System.out.println("Enter the number 2 :");
		    int b= number.nextInt();
		    
			while(true) {
		    System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo\n6. Exit");
		   	System.out.println("Enter your operator to perform arithmetic calculation (1/2/3/4/5/6)?");
		   	int operator=number.nextInt();
		   	
		    switch(operator)
		    	{
		    	case 1:
		    		
		    		System.out.println("Addition of two numbers:"+(a+b));
		    		break;
		    	case 2:
		    		
		    		System.out.println("subtraction of two numbers:"+(a-b));
		    		break;
		    	case 3:
		    		
		    		System.out.println("Multiplication of two numbers:"+(a*b));
		    		break;
		    	case 4:
		    		
		    		System.out.println("Division of two numbers:"+(a/b));
		    		break;
		    	case 5:
		    		
		    		System.out.println("Modulo of two numbers:"+(a%b));
		    		break;
		    	
		    	case 6:
		    		System.exit(0);
		    		
		    	
		    		
		    	}
			
		}
		
	    	
	    	
	}
}


