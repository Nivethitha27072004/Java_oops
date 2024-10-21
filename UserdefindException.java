
public class UserdefindException {
       static  void check(int age) throws MyException{// we can throw multiple exception by doing comma.
        //this throws is used to throws the excetion for the whole block.
        if (age<=12){
            throw new MyException(" age invalid");
            //throw is used to throw an error explictly by creating the new abj for
            //cls arithematic execpation.
        }
       }
        public static void main(String[] args) {
           
        try{
        check(11);
        }
        catch (MyException AE){
            
            System.out.println(AE);
        }
        finally {
            System.out.println("this will run everytime");
        }
        System.out.println("next process");
    }
}
class MyException extends Exception{// user defind Exception.
    public MyException(String str) {
        super(str);
    }
}