import java.util.*;
public class bubbleSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers in the array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
                array[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("The sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+"  ");
        }

    }
}
