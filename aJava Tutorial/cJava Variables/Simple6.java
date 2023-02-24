// Java Variable Example: Adding Lower Type
class Simple6{  
public static void main(String[] args){  
byte a=10, b=10, c;  
//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
c=(byte)(a+b); 
// c=a+b; 
System.out.println(c);  
}}  