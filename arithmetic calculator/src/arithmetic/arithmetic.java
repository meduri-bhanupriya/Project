package arithmetic;
import java.util.Scanner;											

public class arithmetic{

    public static void main(String[] args) {  						
    	char c=0;
        int choice;
        Scanner input = new Scanner(System.in);	
        
        
        do {	
        				
        	System.out.println("Please Select Operation to Perform:");
	        System.out.println("1-Addition");
	        System.out.println("2-Subtraction");
	        System.out.println("3-Division");
	        System.out.println("4-Multiplication");
	        
	        choice = input.nextInt();
	
	        System.out.println("Please enter the first number: ");
	        double first_num = input.nextDouble();
	        
	        System.out.println("Please enter the second number: ");
	        double second_num = input.nextDouble();
	        
	        //creation of object of class Operation and parameterized constructor call.
	        Operation Obj = new Operation(first_num,second_num);
	      
	        switch (choice){												
	        case 1:
	            Obj.addition(first_num,second_num);   			//calling method addition
	            break;
	        case 2:
	            Obj.subtraction(first_num,second_num);
	            break;
	        case 3:
	            Obj.division(first_num,second_num);
	            break;
	        case 4:
	            Obj.multiplication(first_num,second_num);
	            break;
	        default:											//default case if user enters wrong input	
	        	System.out.println("Select from  mentioned operations only");
	        }
	        
	        System.out.println("\n");
	                
	        System.out.println("Enter any key to continue and  'e' to exit");
	        
	        choice = input.next().charAt(0);		//charAt(0) -->returning the char present at index 0       										
	    
        	}while(choice != 'e');							//loop will run until user enters 'e'
        input.close();											//closing the input stream
    } 
  
}