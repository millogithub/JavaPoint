/* Java Switch Statement is fall-through
The Java switch statement is fall-through. It means it executes all statements after the first match if a break statement is not present.

Example:

SwitchExample2.java */

//Java Switch Example where we are omitting the  
//break statement  
public class SwitchExample2 {  
	public static void main(String[] args) {  
		int number=20;  
		//switch expression with int value  
		switch(number){  
		//switch cases without break statements  
		case 10: System.out.println("10");  
		case 20: System.out.println("20");  
		case 30: System.out.println("30");  
		default:System.out.println("Not in 10, 20 or 30");  
		}  
	}  
}  