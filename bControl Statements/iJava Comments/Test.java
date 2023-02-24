/* Are Java comments executable?
Ans: As we know, Java comments are not executed by the compiler or interpreter, however, before the lexical transformation of code in compiler, contents of the code are encoded into ASCII in order to make the processing easy.

Test.java */

public class Test{  
    public static void main(String[] args) {  
        //the below comment will be executed  
		// \u000d System.out.println("Java comment is executed!!");  
    }  
}  

/* 
The above code generate the output because the compiler parses the Unicode character \u000d as a new line before the lexical transformation, and thus the code is transformed as shown below:

Test.java

public class Test{  
    public static void main(String[] args) {  
        //the below comment will be executed  
//  
System.out.println("Java comment is executed!!");  
    }  
}  
Thus, the Unicode character shifts the print statement to next line and it is executed as a normal Java code. */