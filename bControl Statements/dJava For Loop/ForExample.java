/* Loops in Java
The Java for loop is used to iterate a part of the program several times. If the number of iteration is fixed, it is recommended to use for loop.

There are three types of for loops in Java.

Loops in Java
Simple for Loop
For-each or Enhanced for Loop
Labeled for Loop
Java Simple for Loop
A simple for loop is the same as C/C++. We can initialize the variable, check condition and increment/decrement value. It consists of four parts:

Initialization: It is the initial condition which is executed once when the loop starts. Here, we can initialize the variable, or we can use an already initialized variable. It is an optional condition.
Condition: It is the second condition which is executed each time to test the condition of the loop. It continues execution until the condition is false. It must return boolean value either true or false. It is an optional condition.
Increment/Decrement: It increments or decrements the variable value. It is an optional condition.
Statement: The statement of the loop is executed each time until the second condition is false.
Syntax:
Play Video

for(initialization; condition; increment/decrement){    
//statement or code to be executed    
}    
Flowchart:

for loop in java flowchart
Example:

ForExample.java */

//Java Program to demonstrate the example of for loop  
//which prints table of 1  
public class ForExample {  
	public static void main(String[] args) {  
		//Code of Java for loop  
		for(int i=1;i<=10;i++){  
			System.out.println(i);  
		}  
	}  
}  