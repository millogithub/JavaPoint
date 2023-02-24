/* Let's understand the if-statements one by one.

1) Simple if statement:
It is the most basic statement among all control flow statements in Java. It evaluates a Boolean expression and enables the program to enter a block of code if the expression evaluates to true.

Syntax of if statement is given below.

if(condition) {    
statement 1; //executes when condition is true   
}    
Consider the following example in which we have used the if statement in the java code.

Student.java

Student.java */

public class Student1 {    
	public static void main(String[] args) {    
		int x = 10;    
		int y = 12;    
		if(x+y > 20) {    
		System.out.println("x + y is greater than 20");    
		}    
	}      
}     