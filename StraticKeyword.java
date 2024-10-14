public class StraticKeyword {
        public static void main(String[] args) {
            System.out.println(son1.age);// we can access this age without obj by using the class name directly.
            father1.pirnt();
            son1.age =18;//we access the function without creating the obj
            //and also the age variable will be same when it is declared as the static.
            System.out.println(son1.age);
            System.out.println(father1.age);
        }
    }
   class father1 {
         static int age=50;
         static void pirnt(){
             System.out.println("printing");
         }
    }
    class son1 extends father1 {

    }

