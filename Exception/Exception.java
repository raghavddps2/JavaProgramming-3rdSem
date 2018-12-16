/*
Guys, this program tells about the throw and catch in detail!!
*/
import java.util.Scanner;
public class Exception{
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a:\t");
            a = sc.nextInt();
            
            System.out.println("Enter b:\t");
            b = sc.nextInt();
            System.out.println("Division is :"+ a/b);
            System.out.println("Try worked!");
        }
        catch(ArithmeticException e){
            System.out.println("There was an error");
            System.out.println("I am in Catch");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Hey, I got executed!");
        }
        System.out.println("Enter c");
        int c= sc.nextInt();
        System.out.println("C is :"+c);

        try{
            String s1 = null;
            System.out.println("Length of string is:"+s1.length());
            System.out.println("Hey!");
        }
        catch(NullPointerException e){
            System.out.println("Ho la la");
            System.out.println(e.getCause()); //This is giving the message as null
            System.out.println("This gives the whoole exception"); 
        }
        finally{
            System.out.println("I am the  boss dude");
        }
        System.out.println("Enter d");
        int d= sc.nextInt();
        System.out.println("C is :"+d);
    }
}