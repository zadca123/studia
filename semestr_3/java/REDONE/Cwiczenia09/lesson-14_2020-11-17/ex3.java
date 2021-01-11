import pl.imiajd.Salwowski.*;
import java.time.*;
import java.util.*;
import java.io.*;

public class ex3{
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        try{
            File file = new File("./ex3test.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                arr.add(scanner.nextLine());
            }
        }
        catch(FileNotFoundException error){
            error.printStackTrace();
        }

        for(String str : arr){
            System.out.println(str);
        }
    }
}
