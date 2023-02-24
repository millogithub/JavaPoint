/*2) if-else statement
The if-else statement is an extension to the if-statement, which uses another block of code, i.e., else block. The else block is executed if the condition of the if-block is evaluated as false.

Syntax:

if(condition) {    
statement 1; //executes when condition is true   
}  
else{  
statement 2; //executes when condition is false   
}  
Consider the following example.

Student.java */

public class Student2 {  
	public static void main(String[] args) {  
		int x = 10;  
		int y = 12;  
		if(x+y < 10) {  
		System.out.println("x + y is less than 10");  
		}   
		else {  
		System.out.println("x + y is greater than 20");  
		}  
	}  
}  