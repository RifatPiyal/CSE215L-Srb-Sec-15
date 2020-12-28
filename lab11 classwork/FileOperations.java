import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOperations {

    public static void main(String[] args) {
        String filename = "test.txt";
        PrintWriter output=null;
        try{
            output = new PrintWriter(new FileOutputStream(filename, true));
        }catch(FileNotFoundException e){
            System.out.println("file not found exception caught");
        }
        
        System.out.println("enter few strings");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< 3; i++){
            String ln = sc.nextLine();
            output.println(i+" th input "+ ln);
        }
        output.close();
        System.out.println("lines written successfully");
    }
    
}