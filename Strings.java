import java.util.*;
public class Strings{

    String s,k,j,p;

    public static void main(String[] args){

            String s,k,j;
            Scanner sc = new Scanner(System.in);

            while(true){
                System.out.println("----------------------------------------------------------");
                System.out.println("**************************Menu*********************");
                System.out.println("1.Extract a portion of the string");
                System.out.println("2.Count the occurences of a particular word");
                System.out.println("3.Replace a substring with a given string");
                System.out.println("4.Rearange the string and write it in alphabetical order");
                System.out.println("5.Compare two strings ignoring case");
                System.out.println("6.Conactenate two strings");
                System.out.println("7.EXIT!");

                int ch;
                System.out.print("Enter youe choice:    ");
                ch = sc.nextInt();
                    sc.nextLine();
                switch(ch){
                    case 1:
                        System.out.print("Enter the String:   ");
                        s = sc.nextLine();
                        System.out.print("Enter the starting position for string extraction");
                        int n = sc.nextInt();
                        System.out.print("Enter the no of characters to be extracted");
                        int m = sc.nextInt();
                        k = s.substring(n-1,m+n-1);
                        System.out.println("The extracted string is:   "+ k);
                        break;

                    case 2:
                        System.out.print("Enter the String:   ");
                        s = sc.nextLine();
                        System.out.print("Enter the word whose occurences you have to find:   ");
                        k = sc.next();
                        String[] splits = s.split(" ");
                        int counter =0;
                        for(int i=0;i<splits.length;i++){
                            if(splits[i].equals(k))
                                counter++;
                        }
                        System.out.println("The no of occurences of the word are: "+counter);
                        break;

                    case 3:
                        System.out.print("Enter the String:   ");
                        s = sc.nextLine();
                        System.out.print("Enter the substring you wanna replace:   ");
                        k = sc.next();
                        System.out.print("Enter the substring with which you wanna replace it:   ");
                        j = sc.next();
                        System.out.println("The string after replacement is  "+s.replace(k,j));
                        break;
                    
                    case 4:
                        System.out.println("Enter the String");
                        s = sc.nextLine();
                        k = s.toLowerCase();
                        char sortString[] = k.toCharArray();
                        Arrays.sort(sortString);
                        j =new String(sortString);
                        System.out.println("The string after sorting is:  "+j);
                        break;
                    
                    case 5:
                        System.out.println("Enter string 1");
                        s = sc.nextLine();
                        System.out.println("Enter string 2");
                        k = sc.nextLine();

                        boolean cmp = s.equalsIgnoreCase(k);
                        if(cmp){
                            System.out.println("The two strings are equal");
                        }
                        else{
                            System.out.println("The two strings are not equal");
                        }
                        break;

                    case 6:
                        System.out.println("Enter string 1");
                        s = sc.nextLine();
                        System.out.println("Enter string 2");
                        k = sc.nextLine();
                        j = s +" "+ k;
                        System.out.println("The string after concatenation is: "+ j);
                        break;

                    case 7:
                        System.exit(0);
                    
                    default:
                        System.out.println("IVALID CHOICE");
                }
            }
    }
}
