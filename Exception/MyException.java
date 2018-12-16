class Throwable extends Exception{
    private int detail;
    Throwable(int a){
        detail = a;
    }
    public String toString(){
        return "Throwable "+detail;
    }
}
//This is how we create our own custom exception
public class MyException{
    static void compute(int a) throws Throwable{
        System.out.println("I will be printed twice");  
        if(a>10){
            throw new Throwable(a);
        }
        System.out.println("Normal Exit!");
    }
    public static void main(String[] args){
        try{
            compute(1);
            compute(20);
        }
        catch(Throwable e){
            System.out.println("caught:" +e);
        }
    }
}