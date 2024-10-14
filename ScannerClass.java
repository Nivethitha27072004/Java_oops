import java.util.Scanner;// this is a cls which as the function to get input from user.
public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values:");
        String a= sc.nextLine();// for line
        String b=  sc.next();//for word
        int c=   sc.nextInt();
        long d=sc.nextLong();
        float f= sc.nextFloat();
        char g =sc.nextLine().charAt(0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);






    }
}
