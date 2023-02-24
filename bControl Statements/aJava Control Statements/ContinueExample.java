/* 
Java continue statement
Unlike break statement, the continue statement doesn't break the loop, whereas, it skips the specific part of the loop and jumps to the next iteration of the loop immediately.

Consider the following example to understand the functioning of the continue statement in Java.
 */
public class ContinueExample {  
  
public static void main(String[] args) {  
// TODO Auto-generated method stub  
  
for(int i = 0; i<= 2; i++) {  
  
for (int j = i; j<=5; j++) {  
  
if(j == 4) {  
continue;  
}  
System.out.println(j);  
}  
}  
}  
  
}