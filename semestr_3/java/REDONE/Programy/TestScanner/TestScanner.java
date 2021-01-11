import java.util.Scanner;

public class TestScanner
{

    public static void main(String[] args)
    {

        System.out.println("\nWprowadź kolejny łańcuch znaków i naciśnij <Enter>.");
        System.out.println("Aby zakończyć program naciśnij: <Ctrl> + d\n");

        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            Scanner str = new Scanner(in.nextLine());
            int ile = 0;

            while (str.hasNext()) {
                String s = str.next();
                System.out.print(s + " ");
                ++ile;
            }

            System.out.println("\nIlość wprowadzonych słów: " + ile + "\n");
        }
    }
}

