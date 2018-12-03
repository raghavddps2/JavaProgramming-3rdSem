import java.util.Scanner;
abstract class Vehicle{

    int year_of_manufacture;
    Vehicle(){
        year_of_manufacture = 0;
    }

    abstract void putData(int x);
    abstract int getData();
}

class TwoWheeler extends Vehicle{

        TwoWheeler(){
            year_of_manufacture = 0;
        }
        void putData(int x){
            year_of_manufacture = x;
        }
        int getData(){
            return year_of_manufacture;
        }

}

final class FourWheeler extends Vehicle{

    /*
        The word final here indicates that the class cannot be extended furthur.
    */
    FourWheeler(){
        year_of_manufacture = 0;
    }

    void putData(int x){
        year_of_manufacture = x;
    }
    int getData(){
        return year_of_manufacture;
    }
}

class MyTwoWheeler extends TwoWheeler{

    MyTwoWheeler(){
            
    }
    /*
        We are not writing the get Method here just to shoe the inheritance of the TwoWheeler class from MyTwoWheeler class.
    */
    void putData(int x){
        super.putData(x);
    }
}

public class Q9_Inheritance{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("For Four Wheeler");
        FourWheeler f1 = new FourWheeler();
        System.out.println("Enter the year of Manufacture");
        f1.putData(sc.nextInt());

        System.out.println("For Two Wheeler");
        MyTwoWheeler t1 = new MyTwoWheeler();
        System.out.println("Enter the year of manufacture");
        t1.putData(sc.nextInt());

        System.out.println("The year of manufacture of the four wheeler is: "+f1.getData());
        System.out.println("The year of manufacture of the two wheeler is: "+t1.getData());
    }
}
