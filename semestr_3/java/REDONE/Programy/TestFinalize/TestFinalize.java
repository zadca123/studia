public class TestFinalize
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Ilość utworzonych obiektów typu Klasa = " + Klasa.ile);
        Klasa k1 = new Klasa();
        System.out.println("Ilość utworzonych obiektów typu Klasa = " + k1.ile);
        Klasa k2 = new Klasa();
        System.out.println("Ilość utworzonych obiektów typu Klasa = " + Klasa.ile);
        k1 = k2 = null;
        System.gc(); // wywołanie odśmiecacza pamięci
        Thread.sleep(1);

        System.out.println("Ilość aktualnie istniejących obiektów typu Klasa = " + Klasa.ile);
    }
}

class Klasa
{
    Klasa()
    {
        ++ile;
    }

    public void finalize()
    {
        --ile;
    }

    public static int ile = 0;
}

