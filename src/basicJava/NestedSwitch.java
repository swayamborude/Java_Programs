package basicJava;

import java.util.Scanner;

public class NestedSwitch {
	
	public static void main(String[] args) {
		
		System.out.println("1.English");
		System.out.println("2.Arabic");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Language-");
		int lang = sc.nextInt();
		
		switch(lang)
		{
		
		case 1: System.out.println("1.UK Accent");
	  	        System.out.println("2.UK Accent");
	  	        System.out.println("3.UK Accent");
	  	        
	  	        System.out.println("Enter your English Accent-");
	  	        int englishAccent = sc.nextInt();
	  	        
	  	        switch(englishAccent)
	  	        {
	  	        
	  	        case 1:
	  	        	System.out.println("Call route to London");
	  	        	break;
	  	        case 2:
	  	           	System.out.println("Call route to New York");
	  	        	break;
	  	        case 3:
  	        	    System.out.println("Call route to Sydney");
  	        	    break; 
  	        	default:
  	        		System.out.println("Invalid Input");
	  	        }
	  	        break;
	  	        
		case 2:System.out.println("1.Kuwait Accent");
	           System.out.println("2.Qatar Accent");
	           System.out.println("3.Dubai Accent");
	           
	           System.out.println("Enter your Arabic Accent-");
	           int arabiAccent = sc.nextInt();
		
	           switch(arabiAccent) 
	           {
	           case 1:
	  	        	System.out.println("Call route to London");
	  	        	break;
	  	        case 2:
	  	           	System.out.println("Call route to Doha");
	  	        	break;
	  	        case 3:
 	        	    System.out.println("Call route to Abu Dhabi");
 	        	    break;  
	  	        default:
	        		System.out.println("Invalid Input");
	           }
	      default: System.out.println("Invalid Input");
		
	           sc.close();	
		}			
			
	}
	
}
