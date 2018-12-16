import java.util.Scanner;
public class Exception2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int withdrawalAmt;
        System.out.println("Enter the withdrawl amount:\t");
        withdrawalAmt = sc.nextInt();
/*
Here, we have our throw and our catch!! Yeah, we nailed it!! 
*/
        try{
        if(balance-withdrawalAmt <0){
            throw new ArithmeticException("Insufficient Balance"); //This will handle it as well.
        }
       
        balance = balance-withdrawalAmt;
        System.out.println("Transaction Completed");
    }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        System.out.println("Press 1 to get a love!");
        int a = sc.nextInt();
        if(a == 1){
            System.out.println("Love you baby");
        }
    }
}