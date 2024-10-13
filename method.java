public class methods {
    public static void main(String[] args) {
        // fuction CALL.
        add(); //void fuction without parametier
        add0(12, 10);//void function and with parameters which can get input from user.
        int  a= add1()*2;//non void function without parameters.
        System.out.println(a);
        int  b= add2(12,10)*2;//non void function with parameters .
        System.out.println(b);
    }
// function definition

    //void function which returns nothing and
    // also without parameters.
    public static void add() {// void id return type which says the outputs datatype
        int a = 10;
        int b = 12;
        int c = a + b;
        System.out.println(c);
    }

    //void function and with parameters which can get input from user.
    public static void add0(int a, int b) {// the value within baraket  is called arguments or parameter.
        int c = a + b;
        System.out.println(c);
    }
// non void function which helps to retuns to where it is called we can do sokme operation with it.
    // non-void function and without  parameters .
    public static int add1() {
        int a = 12;
        int b = 10;
        int c = a + b;
        System.out.println(c);
        return c;
    }

    // non-void function and with  parameters .
    public static int add2(int a, int b) {
        int c = a + b;
        System.out.println(c);
        return c;
    }
}