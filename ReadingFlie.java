// to read a file 
//file handling
import java.io.File;
import java.util.Scanner;
public class ReadingFlie{
    public static void main(String[] args) {
        try{
        File f=new File("forFileReadingNDWriting.txt");
        Scanner sc=new Scanner(f);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
            
            
        }
    }
    catch(Exception E){
        System.out.println(E.getMessage());
    }
    }


}