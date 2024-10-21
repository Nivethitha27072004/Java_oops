//this chapeter provides example of throw keyword and finnaly 
public class ThrowAndThrows {
        void check(int age){
        if (age<=12){
            throw new ArithmeticException(" age invalid");
            //throw is used to throw an error explictly by creating the new abj for
            //cls arithematic execpation.
        }
       }
        public static void main(String[] args) {
            ThrowAndThrows t=new ThrowAndThrows();
        try{
        t.check(11);
        }
        catch (ArithmeticException AE){
            
            System.out.println(AE);
        }
        finally {
            System.out.println("this will run everytime");
        }
        System.out.println("next process");
    }
}
