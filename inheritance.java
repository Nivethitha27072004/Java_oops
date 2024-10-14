
//inheritance

public class inheritance {
    //inheriting the properties from parent cls.
    public static void main(String[] args) {
       father dad=new father();
        System.out.println(dad.name);
        System.out.println(dad.income);
        System.out.println(dad.appa());


        son boy= new son();
        System.out.println(boy.name);
        System.out.println(boy.income);
        System.out.println(boy.appa());

    }

}
class father {
    String name = "khan";
    int income = 30000;

    public char appa() {
        char gender = 'M';// also return 'm' is posible.
        return gender;
    }
}
    class son extends father {

    }



//types of inheritance
//single inheritance which has 1 parent from one child
/*
public class inheritance {
    //inheriting the properties from parent cls.
    public static void main(String[] args) {
        father dad=new father();
        System.out.println(dad.name);
        System.out.println(dad.income);
        System.out.println(dad.appa());


        son boy= new son();
        System.out.println(boy.name);
        System.out.println(boy.income);
        System.out.println(boy.appa());

    }

}
class father {
    String name = "khan";
    int income = 30000;

    public char appa() {
        char gender = 'M';// also return 'm' is posible.
        return gender;
    }
}
class son extends father {

}
*/

/*

 //multi level inheritance
//thatha to appa to son
public class inheritance {
    //inheriting the properties from parent cls.
    public static void main(String[] args) {
        girl g= new girl();
        System.out.println(g.name);
        System.out.println(g.gender);
        System.out.println(g.appa());

    }

}

class grandfather{
    String name = "khan";

    char gender = 'M';
    public int  appa() {
        return 30000;
    }
}
class mother extends grandfather {
    char gender = 'F';
}
class girl extends mother {

}

*/
/*
//herirachical inheritance
//one parent many child.
public class inheritance {
    //inheriting the properties from parent cls.
    public static void main(String[] args) {
        girl g= new girl();
        System.out.println(g.gender);

        boy b= new boy();
        System.out.println(b.gender);

    }

}
class grandfather{


    char gender = 'M';
}
class girl extends grandfather {
    char gender = 'F';
}
class boy extends grandfather {
    char gender = 'M';
}
*/
