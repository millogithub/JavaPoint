/* As you can see in the above output, 5 is not printed on the console. It is because the loop is continued when it reaches to 5.

Java Continue Statement with Inner Loop
It continues inner loop only if you use the continue statement inside the inner loop.

ContinueExample2.java
 */
//Java Program to illustrate the use of continue statement  
//inside an inner loop  

public class ContinueExample2 {  
	public static void main(String[] args) {  
				//outer loop  
				for(int i=1;i<=3;i++){    
						//inner loop  
						for(int j=1;j<=3;j++){    
							if(i==2&&j==2){    
								//using continue statement inside inner loop  
								continue;    
							}    
							System.out.println(i+" "+j);    
						}    
				}    
	}  
} 