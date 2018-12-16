import java.io.*;
public class Exception3{
    public static void main(String[] args) throws IOException{
      /*  throw new IOException();
        System.out.println("hey!");
        */
        //Compiler says to catch it because the exception cannot be caught!
        //Can do it either by a try catch block or have to use the keyword throws...s
/*
        try{
            throw new IOException();
            
        }
        catch(IOException e){
            System.out.println("HEY!!!!");
            System.out.println("Hey!");
        }
*/
//To be done in either this way, now i am going to try the best approach, declare it as throws!!
System.out.println("Program will continue my boy!!");
 throw new IOException();
       // System.out.println("Program will continue my boy!!"); This is unreachable
        
    }
}
/*
Using throws we can just remove the compile time exception, that all, basically handling is done 
using the try catch block only.
try and catch
throw new ArithemeticException("hi!");