public class AccesModifier {
         String name;
        int rolnum;

        public void display() {
            System.out.println(name);
            System.out.println(rolnum);

        }
        public void setvalue(String s,int r ){//to get value from usere name=s;
            name=s;
            rolnum=r;
        }

        // to access value from the private cls .
        public String getvlue(String s,int r ){//to get value from usere name=s;
            return name;
        }

    }
    class maineg
    {
        public static void main(String[] args) {
            AccesModifier ob=new AccesModifier();// obj is xerox of application form
            ob.setvalue("nive",76);
            ob.display();

/*
            AccesModifier viewer=new AccesModifier();
            //viewer.name="nive";
            viewer.rolnum =30;
            viewer.display();

  */
            AccesModifier view=new AccesModifier();
            view.setvalue( "nive",1213);
            view.getvlue("niveeee",786);
            view.rolnum =30;
            view.display();
        }
    }




