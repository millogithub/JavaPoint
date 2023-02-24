/* 
The Java do-while loop is used to iterate a part of the program repeatedly, until the specified condition is true. If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use a do-while loop.

Java do-while loop is called an exit control loop. Therefore, unlike while loop and for loop, the do-while check the condition at the end of loop body. The Java do-while loop is executed at least once because condition is checked after loop body.

Syntax:

do{    
//code to be executed / loop body  
//update statement   
}while (condition);    
The different parts of do-while loop:
Play Video

1. Condition: It is an expression which is tested. If the condition is true, the loop body is executed and control goes to update expression. As soon as the condition becomes false, loop breaks automatically.

Example:

i <=100

2. Update expression: Every time the loop body is executed, the this expression increments or decrements loop variable.

Example:

i++;

Note: The do block is executed at least once, even if the condition is false.
Flowchart of do-while loop:

flowchart of do while loop in java
Example:

In the below example, we print integer values from 1 to 10. Unlike the for loop, we separately need to initialize and increment the variable used in the condition (here, i). Otherwise, the loop will execute infinitely.

DoWhileExample.java
 */
 
public class DoWhileExample {    
	public static void main(String[] args) {    
		int i=1;    
		do{    
			System.out.println(i);    
		i++;    
		}while(i<=10);    
	}    
}   