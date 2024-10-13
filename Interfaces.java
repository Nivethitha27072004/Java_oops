
 public class Interfaces {
     public static void main(String[] args) {
         // Anonymous class implementation for thagapan
         thagapan t = new thagapan() {
             @Override
             public void call() {
                 System.out.println("calling from thagapan");
             }
             @Override
             public void talk() {
                 System.out.println("talking from thagapan");
             }
         };
         t.call();
         t.talk();

         // Anonymous class implementation for madha
         madha m = new madha() {
             @Override
             public void call() {
                 System.out.println("calling from madha");
             }
             @Override
             public void talk() {
                 System.out.println("talking from madha");
             }
         };


         // Call methods

         m.call();
         m.talk();
     }

     interface thagapan {
         void call();
         void talk();
     }

     interface madha {
         void call();
         void talk();
     }
 }

















