import java.util.*;
public class Stack{
    int size;
    int top;
    int array[];
    Scanner sc = new Scanner(System.in);
    Stack(int size,int top){
        this.size = size;
        this.top = top;
        this.array = new int[size];
    }

    public void push(int element){
        if(top == size-1){
            System.out.println("Stack Overflow");
        }
        else{
            array[++top] = element;
        }
    }

    public int pop(){
        if(top == -1){
            return -1;
        }
        else{
            return array[top--];
        }
    }

    public void display(){
        if(top == -1){
            System.out.println("Stack Underflow");
        }
        else{
            System.out.print("The elemnets of the array are:  ");
            for(int i=top;i>=0;i--)
                System.out.print(array[i]+"  ");
        }
    }
    public static void main(String[] args){

        System.out.println("Enter the size of the stack:   ");
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        Stack s1 = new Stack(size,-1);

        while(true){
            System.out.println("");
            System.out.println("*************************MENU**********************");
            System.out.println("1. Push an element into the stack");
            System.out.println("2.Pop an element from the stack");
            System.out.println("3.Display the elements of the stack");
            System.out.println("4.EXIT!");

            int choice;
            System.out.println("Enter your choice:    ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                        System.out.println("Enter the element you wanna push into the stack");
                        int element1;
                        element1 = sc.nextInt();
                        s1.push(element1);
                        break;
                
                case 2:
                        int element2 = s1.pop();
                        if(element2 != -1){
                            System.out.println("The element popped out from the stack is:  "+element2);
                        }
                        else{
                            System.out.println("Stack Underflow");
                        }
                        break;
                case 3:
                        s1.display();
                        break;
                case 4:
                        System.exit(0);
                default:
                        System.out.println("Invalid choice");
            }
        }
    }
}
