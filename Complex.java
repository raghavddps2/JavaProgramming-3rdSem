import java.util.*;
public class Complex{
    int a;
    int b;

    Complex(int a,int b){
        this.a = a;
        this.b = b;
    }
    Complex(){
        this.a = 0;
        this.b = 0;
    }
    public Complex sum_c(Complex c1, Complex c2){
        Complex c3 = new Complex();
        c3.a = c1.a + c2.a;
        c3.b = c1.b + c2.b;
        return c3;
    }

    public Complex diff_c(Complex c1,Complex c2){
        Complex c3 = new Complex();
        c3.a = c1.a - c2.a;
        c3.b = c1.b - c2.b;
        return c3;
    }

    public Complex mul_c(Complex c1,Complex c2){
        Complex c3 = new Complex();
        c3.a = c1.a * c2.a;
        c3.b = c1.b * c2.b;
        return c3;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        System.out.println("Enter the Complex Number 1");
        System.out.print("Enter the real part:   ");
        c1.a = sc.nextInt();
        System.out.print("Ener the imaginary part:   ");
        c1.b = sc.nextInt();
        System.out.println("------------------------------------------------");
        System.out.println("Enter the Complex Number 2");
        System.out.print("Enter the real part:   ");
        c2.a = sc.nextInt();
        System.out.print("Ener the imaginary part:   ");
        c2.b = sc.nextInt();

        System.out.println("------------------------------------------------");
        Complex compute = new Complex();
        compute = compute.sum_c(c1,c2);
        System.out.print("The sum of two complex numbers is: ");
        System.out.println(compute.a + " + "+ compute.b + " i");
        
        System.out.println("------------------------------------------------");
        compute = compute.diff_c(c1,c2);
        System.out.print("The difference of two complex numbers is: ");
        System.out.println(compute.a + " + "+ compute.b + " i");
        
        System.out.println("------------------------------------------------");
        compute = compute.mul_c(c1,c2);
        System.out.print("The multiplication of two complex numbers is: ");
        System.out.println(compute.a +" + "+"("+ (-1*compute.b) +")"+ " i");
    }
}
