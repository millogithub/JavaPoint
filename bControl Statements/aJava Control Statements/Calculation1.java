/* 
Loop Statements
In programming, sometimes we need to execute the block of code repeatedly while some condition evaluates to true. However, loop statements are used to execute the set of instructions in a repeated order. The execution of the set of instructions depends upon a particular condition.

In Java, we have three types of loops that execute similarly. However, there are differences in their syntax and condition checking time.

for loop
while loop
do-while loop
Let's understand the loop statements one by one.

Java for loop
In Java, for loop is similar to C and C++. It enables us to initialize the loop variable, check the condition, and increment/decrement in a single line of code. We use the for loop only when we exactly know the number of times, we want to execute the block of code.

for(initialization, condition, increment/decrement) {    
//block of statements    
}    
The flow chart for the for-loop is given below.

Control Flow in Java
Consider the following example to understand the proper functioning of the for loop in java.

Calculation.java
 */
public class Calculation1 {  
public static void main(String[] args) {  
	// TODO Auto-generated method stub  
	int sum = 0;  
		for(int j = 1; j<=10; j++) {  
		sum = sum + j;  
		}  
		System.out.println("The sum of first 10 natural numbers is " + sum);  
	}  
}  