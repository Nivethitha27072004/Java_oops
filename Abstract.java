 //abstract is a key word 
 class Abstract {
     public static void main(String[] args) {
         HP h=new HP();
         h.turnon();
         h.turnoff();
         h.turn();


         dell d=new dell();
         d.turnon();
         d.turnoff();
     }

}
abstract class computer{//we can not directly create obj for the abstarct cls we shodle inheritate it ,
    // abstarct method dont have defnition part it will overrided when it is called
    abstract  void turnon();
    abstract  void turnoff();
    void turn()
    {
        System.out.println("prossing");
    }
}

//abstrac class can be used only if it is inheritated
 class HP extends computer{
    // shoul override all the method in the abstact clss.
    void turnon(){
        System.out.println("hp on");

    }
     void turnoff(){
         System.out.println("hp off");

     }
 }

 class dell extends computer{
     void turnon(){
         System.out.println("dell on");

     }
     void turnoff(){
         System.out.println("dell off");

     }
 }
