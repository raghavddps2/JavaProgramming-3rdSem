public class Exception4{

    static void demoproc(){
        try{
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e){
            System.out.println("Caught inside demoproc");
            throw e;
        }
    }
    public static void main(String[] main){
        try{
            demoproc();
        }
        catch(NullPointerException e){
            System.out.println("Recaught exception:"+e.getMessage());
        }
    }
}