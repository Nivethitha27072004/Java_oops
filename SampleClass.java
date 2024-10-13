//classes and obj.
class SampleClass {
     String name;
     int rolnum;
    public  void display(){
        System.out.println(name);
        System.out.println(rolnum);

    }

    public static void main(String[] args) {
        SampleClass sc=new SampleClass();
        sc.name="hello";
        sc.rolnum=23;
        sc.display();
    }
}
