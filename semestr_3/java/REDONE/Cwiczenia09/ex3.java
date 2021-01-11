import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        ArrayList<String> strArr = new ArrayList<String>();

        try{
            File plik = new File("./ex3.txt");
            Scanner scan = new Scanner(plik);

            while(scan.hasNextLine()){
                strArr.add(scan.nextLine());
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

        strArr.sort(String::compareTo);
        for (String var : strArr) {
            System.out.println(var);
        }

    }
}
