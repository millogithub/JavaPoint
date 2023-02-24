/* 
Java while loop
The while loop is also used to iterate over the number of statements multiple times. However, if we don't know the number of iterations in advance, it is recommended to use a while loop. Unlike for loop, the initialization and increment/decrement doesn't take place inside the loop statement in while loop.

It is also known as the entry-controlled loop since the condition is checked at the start of the loop. If the condition is true, then the loop body will be executed; otherwise, the statements after the loop will be executed.

The syntax of the while loop is given below.

while(condition){    
//looping statements    
}    
The flow chart for the while loop is given in the following image.

Control Flow in Java
Consider the following example.

Calculation .java
 */
 
public class Calculation3 {    
	public static void main(String[] args) {    
		// TODO Auto-generated method stub    
		int i = 0;    
		System.out.println("Printing the list of first 10 even numbers \n");    
		while(i<=10) {    
		System.out.println(i);    
		i = i + 2;    
		}    
	}    
}  