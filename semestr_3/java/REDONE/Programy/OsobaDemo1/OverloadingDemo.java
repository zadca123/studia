public class OverloadingDemo
{
    public static void main(String[] args)
    {
        Object[] tab = {
            new Osoba("Anna Polak", 1993, 12, 25),
            new Osoba("Anna Polak", 1993, 12, 25)
        };

        System.out.println(tab[0].equals(tab[1]));
    }
}


