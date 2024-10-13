public class Constructors {
    int mark;
    int roll;

    /*
        Constructors() {
    // defualt constructer.
        }
    }

    //parameteried construcer
        Constructors(int r, int m) {
         mark=m;
         roll=r;
        }
    Constructors() {
         mark=9897;
         roll=8764;//defult valued
        }
    }
    */
    class sample {
        public static void main(String[] args) {
            Constructors con = new Constructors();//construcder which iniatial zero whwn the obj is created.
            System.out.println(con.mark);
            System.out.println(con.roll);
            System.out.println(con.mark = 34);
            System.out.println(con.roll = 762365);
        }
    }
}

