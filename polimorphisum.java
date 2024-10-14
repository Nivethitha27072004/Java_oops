// is also called method overloading.
public class polimorphisum {
    public static void main(String[] args) {
    sample0 poly=new sample0();
        poly.add();
        poly.add(10,12);
        poly.add(5,5,12);
    }
}
// we can have many function with same name but with diffrenet signature or arguments
 class sample0{
    public void add(){
        int a= 10;
        int b=12;
        int c =a+b;
        System.out.println(c);
    }
     public void add(int a,int b){
        int c=a+b;
         System.out.println(c);
     }
     public void add(int a,int b,int c){
         int d=a+b+c;
         System.out.println(d);
     }
 }
