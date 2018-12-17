/** 
 * Java Program to show that we can overload main method in java.
 * Basically used total 5 overloaded methods, covered all the cases.(Description of all 5 overloaded methods)
 * Method 1: Takes 3 integer arguments
 * Method 2: Takes a string argument
 * Method 3: Takes a string and an integer argument
 * Method 4: Takes an integer array as argument
 * Method 5: Takes three string arguments with return type as String
 * 
 * The Output is at the bottom of the program in the commented section
 * The entire source code can be found at the given url
 *  @param url 
 *  @author Raghav Maheshwari
 *  
 **/



public class OverloadingMain{

    public static void main(String[] args){
        OverloadingMain obj = new OverloadingMain();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("---------Program demonstrating overloading in main method------------");
        print(1);
        main(1,2,3); //This calls the static overloaded main method.(Integer arguments)
        print(2);
        obj.main("Java Programming is cool!"); //Calls the non static overloaded method.(String argumets)
        print(3);
        obj.main(12,"Java Latest Version"); //Calls the non static overloaded method.(Integer and string arguments)
        print(4);
        main(arr); //Calls on static main method with integer array argument (Integer array argument)
        print(5);
        String concat = obj.main("Java","Programming","lab");
        System.out.println("Conactenated String is: "+concat); //Calls on non static method with string arguments
        System.out.println("---------------------------------------------------------------------");
    }
   static void print(int i){
        System.out.println();
        System.out.println("------------------Overloaded Method "+i+"--------------------------------");
        System.out.println();
    }
     // Overloaded Method 5
    public String main(String a,String b,String c){
        System.out.println("In the non static overloaded method  with string as arg and return type: ");
        String concat=a + " "+ b +" "+ c ;
        return concat;
        
    }
     // Overloaded Method 4
    public static void main(Integer[] args){
        System.out.println("In the static overloaded method main with an integer array as argument: ");
        System.out.print("The values are:\t");
        for(int i: args){
            System.out.print(i+" ");
        }
        System.out.println();
    }

        // Overloaded Method 1
    public static void main(int ...val){
        System.out.println("In the static overloaded  main method with integer arguments");
        System.out.print("The values are:\t");
        for(int i: val){
            System.out.print(i+" ");
        }
        System.out.println();
    }
     // Overloaded Method 2
    public void main(String arg){
        System.out.println("In the non static overloaded  main method with string argument");
        System.out.print("The string argument is:\t");
        System.out.print(arg);
        System.out.println();
    }
     // Overloaded Method 3
    public void main(int version,String message){
        System.out.println("In the overloaded non static main method with an int and str arg");
        System.out.print("The Message is : ");
        System.out.print(message+": "+version);
        System.out.println();
    }

}

//The output of the program is:
/*
---------Program demonstrating overloading in main method------------

------------------Overloaded Method 1--------------------------------

In the static overloaded  main method with integer arguments
The values are: 1 2 3

------------------Overloaded Method 2--------------------------------

In the non static overloaded  main method with string argument
The string argument is: Java Programming is cool!

------------------Overloaded Method 3--------------------------------

In the overloaded non static main method with an int and str arg
The Message is : Java Latest Version: 12

------------------Overloaded Method 4--------------------------------

In the static overloaded  main method with integer arguments
The values are: 1 2 3 4 5 6 7 8 9 10

------------------Overloaded Method 5--------------------------------

In the non static overloaded method  with string as arg and return type:
Conactenated String is: Java Programming lab
---------------------------------------------------------------------
*/