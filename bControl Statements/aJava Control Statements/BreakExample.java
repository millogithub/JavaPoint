/* 
Jump Statements
Jump statements are used to transfer the control of the program to the specific statements. In other words, jump statements transfer the execution control to the other part of the program. There are two types of jump statements in Java, i.e., break and continue.

Java break statement
As the name suggests, the break statement is used to break the current flow of the program and transfer the control to the next statement outside a loop or switch statement. However, it breaks only the inner loop in the case of the nested loop.

The break statement cannot be used independently in the Java program, i.e., it can only be written inside the loop or switch statement.

The break statement example with for loop

Consider the following example in which we have used the break statement with the for loop.

BreakExample.java
 */
public class BreakExample {  
  
	public static void main(String[] args) {  
		// TODO Auto-generated method stub  
		for(int i = 0; i<= 10; i++) {  
		System.out.println(i);  
		if(i==6) {  
		break;  
		}  
		}  
	}  
}