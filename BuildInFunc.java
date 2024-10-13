public class BuildInFunc {
    public static void main(String[] args) {
        String txt="hello makkaley yapti irku";


        System.out.println("String length="+txt.length());


        System.out.println("upper case="+txt.toUpperCase());


        System.out.println("lower case="+txt.toLowerCase());


        System.out.println("index of "+txt.indexOf("yapti"));//including white space


        String fristname="nivethithaa ";
        String lastname="saravanvel";
        System.out.println("concartination="+fristname.concat(lastname));

        //blackslash escape characters
        String txt1= "hello everyone this is \'nivethithaa\' from agoor";
        String txt2="hello everyone this is \"nivethithaa\" from agoor";
        String txt3="hello everyone this is \\nivethithaa\\ from agoor";
        System.out.println(txt1);
        System.out.println(txt2);
        System.out.println(txt3);

        //escape char
        String A="to try the new line\n function";
        String B="to try the carriage return\r lululufunction";
        String C="to try the tab \t function";
        String D="to try the backspacel\b function";
        String E="to try the form feed\f function";//idk

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);


        // integer

        //for this import math lab

        int a=Math.max(3,4);
        int b=Math.min(5,6);
        double c=Math.sqrt(81);
        long d=Math.round(96.8);
        double e=Math.abs(-4.7);
        double f=Math.random()*40;
        System.out.println(f);




        // for array:

        int[] arr={23,43,12,54,65,65};
        System.out.println(arr.length);
        for (int i:arr){
            System.out.print(i+"\t");
        }

        int [][] car1={{23,34,45,56},{78,89,90}};
        for(int[] i:car1){
            for(int j:i){
                System.out.print(j+"\t");
            }
            System.out.println(" ");

        }


    }
}
