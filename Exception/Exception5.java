public class Exception5{
    static void throwOne() throws IllegalAccessException{
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args){
        try{
            throwOne();
        }
        catch(IllegalAccessException e){
            System.out.println("Caught"+e);
        }
    }
}