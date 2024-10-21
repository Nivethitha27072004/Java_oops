import java.io.File;
import java.io.FileWriter;
public class WritingFile{
    public static void main(String[] args) {
         try{
    File fx =new File("ExampleforWriting.txt");
    FileWriter w=new FileWriter(fx);
    w.write("Welcome Nivethithaa Saravanvel");
    w.close();
    }
    catch(Exception E){
        System.err.println(E);
    }

    }

}