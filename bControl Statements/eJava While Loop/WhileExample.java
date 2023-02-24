/* Java While Loop
The Java while loop is used to iterate a part of the program repeatedly until the specified Boolean condition is true. As soon as the Boolean condition becomes false, the loop automatically stops.

The while loop is considered as a repeating if statement. If the number of iteration is not fixed, it is recommended to use the while loop.

Syntax:

while (condition){    
//code to be executed   
I ncrement / decrement statement  
}    
The different parts of do-while loop:


1. Condition: It is an expression which is tested. If the condition is true, the loop body is executed and control goes to update expression. When the condition becomes false, we exit the while loop.

Example:

i <=100

2. Update expression: Every time the loop body is executed, this expression increments or decrements loop variable.

Example:

i++;

Flowchart of Java While Loop

Here, the important thing about while loop is that, sometimes it may not even execute. If the condition to be tested results into false, the loop body is skipped and first statement after the while loop will be executed.

flowchart of java while loop
Example:

In the below example, we print integer values from 1 to 10. Unlike the for loop, we separately need to initialize and increment the variable used in the condition (here, i). Otherwise, the loop will execute infinitely.

WhileExample.java
 */
public class WhileExample {  
	public static void main(String[] args) {  
		int i=1;  
		while(i<=10){  
			System.out.println(i);  
		i++;  
		}  
	}  
}  