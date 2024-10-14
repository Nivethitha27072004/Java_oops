public class overriding {

    //inheriting the properties from parent cls.
    public static void main(String[] args) {
        father0 dad=new father0();
        System.out.println(dad.name);
        System.out.println(dad.income);
        System.out.println(dad.appa());


        son0 boy= new son0();
        System.out.println(boy.name);
        System.out.println(boy.income);
        System.out.println(boy.appa());

    }

}
class father0 {
    String name = "khan";
    int income = 30000;

    public char appa() {
        return 'M';
    }
}
class son0 extends father0 {
    //method or felid over ridding is the way of correting in sub cls of super cls
    String name = "amir"+"khan";
    int income = 3000000;
    public char appa() {
        return 'm';
    }
}
