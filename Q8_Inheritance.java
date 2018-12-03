import java.util.Scanner;
import java.lang.Math;
class Circle{

    double radius;

    Circle(){
        radius = 0;
    }
    Circle(double r){
        radius = r;
    }
    double Circle_area(){
        return (Math.PI * radius *radius);
    }
}

class Sector extends Circle{

    double angle;
    Sector(double a, double r){
        angle = a;
        radius = r;
    }

    Sector(){
        angle = 0;
        radius = 0;
    }
    double Sector_area(){
        return (0.5*radius*radius*angle);
    }
}

class Segment extends Circle{

    double length;
    Segment(){
        radius = 0;
        length = 0;
    }
    Segment(double l,double r){
        radius = r;
        length = l;
    }
    double Segment_area(){
        double h = radius - Math.pow(Math.pow(radius, 2) - Math.pow((length / 2), 2), 0.5);
        return ((h / (6 * length)) * ((3 * h * h) + (4 * length * length)));
    }
}

class Q8_Inheritance{

    public static void main(String[] args){
        double a,r,l;
        int ch;
            Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("--------------------------------------------");
            System.out.println("1. Area of circle");
            System.out.println("2. Area of sector of circle");
            System.out.println("3. Area of segment of circle");
            System.out.println("4. Exit!");
            System.out.println("--------------------------------------------");

            System.out.println("Enter your choice?");
            ch = sc.nextInt();

            switch(ch){

                case 1:
                        System.out.println("Enter the radius of the circle");
                        r = sc.nextDouble();
                        Circle c = new Circle(r);
                        System.out.println("The area of the circle is: "+ c.Circle_area());
                        break;

                case 2:
                        System.out.println("Ennter the radius of the circle");
                        r = sc.nextDouble();
                        System.out.println("Enter the angle of sector in radians");
                        a = sc.nextDouble();
                        Sector s1 = new Sector(a,r);
                        System.out.println("The area of the segment of the circle is: "+s1.Sector_area());
                        break;

                case 3:
                        System.out.println("Enter the radius of the circle");
                        r = sc.nextDouble();
                        System.out.println("Enter the length of segment of the circle");
                        l = sc.nextDouble();
                        Segment s2 = new Segment(l,r);
                        System.out.println("The area of the segment of the circle is: "+s2.Segment_area());
                        break;
                
                case 4:
                        System.exit(0);
                        break;

                default:
                        System.out.println("Invalid choice!!");
            }
        }
    }
}
