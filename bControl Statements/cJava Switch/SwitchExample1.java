/* Java Switch Statement
The Java switch statement executes one statement from multiple conditions. It is like if-else-if ladder statement. The switch statement works with byte, short, int, long, enum types, String and some wrapper types like Byte, Short, Int, and Long. Since Java 7, you can use strings in the switch statement.

In other words, the switch statement tests the equality of a variable against multiple values.

Points to Remember
There can be one or N number of case values for a switch expression.
The case value must be of switch expression type only. The case value must be literal or constant. It doesn't allow variables.
The case values must be unique. In case of duplicate value, it renders compile-time error.
The Java switch expression must be of byte, short, int, long (with its Wrapper type), enums and string.
Each case statement can have a break statement which is optional. When control reaches to the break statement, it jumps the control after the switch expression. If a break statement is not found, it executes the next case.
The case value can have a default label which is optional.
Syntax:

switch(expression){    
case value1:    
 //code to be executed;    
 break;  //optional  
case value2:    
 //code to be executed;    
 break;  //optional  
......    
    
default:     
  code to be executed if all cases are not matched;  
}    
Flowchart of Switch Statement
Play Video

flow of switch statement in java
Example:

SwitchExample.java
 */
public class SwitchExample1 {  
	public static void main(String[] args) {  
		//Declaring a variable for switch expression  
		int number=20;  
		//Switch expression  
		switch(number){  
		//Case statements  
		case 10: System.out.println("10");  
		break;  
		case 20: System.out.println("20");  
		break;  
		case 30: System.out.println("30");  
		break;  
		//Default case statement  
		default:System.out.println("Not in 10, 20 or 30");  
		}  
	}  
}  