
// Note: Usually // is used for short comments and /* */ is used for longer comments.
// 3) Java Documentation Comment
// Documentation comments are usually used to write large programs for a project or software application as it helps to create documentation API. These APIs are needed for reference, i.e., which classes, methods, arguments, etc., are used in the code.

// To create documentation API, we need to use the javadoc tool. The documentation comments are placed between /** and */.

// Syntax:

/**  
* 
*We can use various tags to depict the parameter 
*or heading or author name 
*We can also use HTML tags   
* 
*/ 
   
// javadoc tags
// Some of the commonly used tags in documentation comments:

// Tag	Syntax	Description
// {@docRoot}	{@docRoot}	to depict relative path to root directory of generated document from any page.
// @author	@author name - text	To add the author of the class.
// @code	{@code text}	To show the text in code font without interpreting it as html markup or nested javadoc tag.
// @version	@version version-text	To specify "Version" subheading and version-text when -version option is used.
// @since	@since release	To add "Since" heading with since text to generated documentation.
// @param	@param parameter-name description	To add a parameter with given name and description to 'Parameters' section.
// @return	@return description	Required for every method that returns something (except void)
// Let's use the Javadoc tag in a Java program.

//Calculate.java

import java.io.*;  
  
/** 
 * <h2> Calculation of numbers </h2> 
 * This program implements an application 
 * to perform operation such as addition of numbers  
 * and print the result  
 * <p> 
 * <b>Note:</b> Comments make the code readable and  
 * easy to understand. 
 *  
 * @author Anurati  
 * @version 16.0 
 * @since 2021-07-06 
 */  
   
 public class Calculate{  
    /** 
     * This method calculates the summation of two integers. 
     * @param input1 This is the first parameter to sum() method 
     * @param input2 This is the second parameter to the sum() method. 
     * @return int This returns the addition of input1 and input2 
     */  
    public int sum(int input1, int input2){  
        return input1 + input2;  
    }  
    /** 
    * This is the main method uses of sum() method. 
    * @param args Unused 
    * @see IOException  
    */    
    public static void main(String[] args) {  
        Calculate obj = new Calculate();  
        int result = obj.sum(40, 20);  
  
        System.out.println("Addition of numbers: " + result);  
    }    
 }  
/* 
Compile it by javac tool:

Create Document

java comments
Create documentation API by javadoc tool:

java comments
Now, the HTML files are created for the Calculate class in the current directory, i.e., abcDemo. Open the HTML files, and we can see the explanation of Calculate class provided through the documentation comment.  */