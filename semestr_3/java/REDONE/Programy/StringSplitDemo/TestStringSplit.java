import java.util.Scanner;

public class TestStringSplit {

    public static void main(String[] args)
    {

        System.out.println("\nWprowadź kolejny łańcuch znaków i naciśnij <Enter>.");
        System.out.println("Aby zakończyć program naciśnij: <Ctrl> + d\n");

        Scanner in = new Scanner(System.in);


        while (in.hasNextLine()) {
            String str = in.nextLine();
            // String[] tab = str.split(" ");
            String[] tab = str.split("[\t ,]");

            StringBuffer revStr = new StringBuffer();
            for (int j = tab.length - 1; j >= 0; --j) {
                if (tab[j].length > 0) {
                    revStr.append(tab[j]);
                    revStr.append(" ");
                }
            }

            System.out.println("Original string: " + str);
            System.out.println("\nReversed string: " + revStr + "\n");
        }

    }

}

