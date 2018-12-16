import java.util.Scanner;
public class Exception1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int withdrawalAmt;
        System.out.println("Enter the withdrawl amount:\t");
        withdrawalAmt = sc.nextInt();


        if(balance-withdrawalAmt <0){
            throw new ArithmeticException("Insufficient Balance");//Our throw defaultCatch
            //System.out.println("Hey!");  //Unreachable statement
        }
        /*
            As there is default catch, so the program stops there itself.

        */
        balance = balance-withdrawalAmt;
        System.out.println("Transaction Completed");
        System.out.println("Press 1 to get a love!");
        int a = sc.nextInt();
        if(a == 1){
            System.out.println("Love you baby");
        }
    }
}