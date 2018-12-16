public class Exception7{
    static void demoproc(){
        NullPointerException e = new NullPointerException("top layer");

        e.initCause(new ArithmeticException("cause"));
        throw e;
    }
    public static void main(String[] args){
        try{
            demoproc();
        }
        catch(NullPointerException e){
            System.out.println("Caught:"+e);
            System.out.println("Original Cause: "+e.getCause());
        }
        System.out.println("Hey!");
    }
}
/*
Baically e.initCause(Throwable excCause);
e.initCause(new ArithmeticException("cause"));
e.getCause() ///This retruns the cause.

*/