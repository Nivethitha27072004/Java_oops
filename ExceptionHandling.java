//exeception is the way that stops the program at cetain line to avoid this exeh. is used and  helps terminate till the last line
// if threr is no exeception is handeled then the code will to terminate at an error.
// but when we use the try and catch will run completely.

public class ExceptionHandling {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        //this try and catch block is called exeception handling
        try{
            //try block should have the code which might have the error
            System.out.println(a/b);
        }
        //one try block can have mutiple ctach blocks.
        //arithemeticexeption is a class so we have to create a obj to call them.
        catch (ArithmeticException AE){
            //this shloud contain tand repair the expection to condinue next line
            System.out.println("aree muttal divide by zerooo");

        }// finnaly is not nessary.
        finally {
            System.out.println("this will run everytime");// even with erreor without error.
        }
        System.out.println("next process");
    }
}
