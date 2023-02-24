/* Java Switch Statement with String
Java allows us to use strings in switch expression since Java SE 7. The case statement should be string literal.

Example:

SwitchStringExample.java */

//Java Program to demonstrate the use of Java Switch  
//statement with String  
public class SwitchStringExample {    
	public static void main(String[] args) {    
		//Declaring String variable  
		String levelString="Beginner";  
		int level=0;  
		//Using String in Switch expression  
		switch(levelString){    
		//Using String Literal in Switch case  
		case "Beginner": level=1;  
		break;    
		case "Intermediate": level=2;  
		break;    
		case "Expert": level=3;  
		break;    
		default: level=0;  
		break;  
		}    
		System.out.println("Your Level is: "+level);  
	}    
}   