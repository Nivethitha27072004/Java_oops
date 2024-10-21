//a fuction callses itself in func def is called recusion
// binary sort is usuind.
public class Recursion {
    public static void main(String[] args) {

        natprint(12);
    }
    public static void natprint( int n){
        if(n==1){
            System.out.println(1);// base case

        }
        else {
            System.out.println(n);
            //fuction callses itself is called recursion
            natprint(n - 1);//recursive case
        }

    }

}

