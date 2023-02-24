/* 
Java do-while loop
The do-while loop checks the condition at the end of the loop after executing the loop statements. When the number of iteration is not known and we have to execute the loop at least once, we can use do-while loop.

It is also known as the exit-controlled loop since the condition is not checked in advance. The syntax of the do-while loop is given below.

do     
{    
//statements    
} while (condition);    
The flow chart of the do-while loop is given in the following image.

Control Flow in Java
Consider the following example to understand the functioning of the do-while loop in Java.

Calculation.java
 */
public class Calculation4 {    
	public static void main(String[] args) {    
		// TODO Auto-generated method stub    
		int i = 0;    
		System.out.println("Printing the list of first 10 even numbers \n");    
		do {    
		System.out.println(i);    
		// i = i + 2;
		i = i + 3;
		}while(i<=10);    
	}    
}    