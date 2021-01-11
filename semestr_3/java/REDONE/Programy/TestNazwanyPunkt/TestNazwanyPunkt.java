public class TestNazwanyPunkt
{
    public static void main(String[] args)
    {
        NazwanyPunkt a = new NazwanyPunkt(3, 5, "port");
        a.show();

        Punkt b = new Punkt(3, 5);
        b.show();

        Punkt c = new NazwanyPunkt(3, 6, "tawerna");
        c.show();

        //a = b;               //  --- powoduje błąd kompilacji  (dlaczego ?)
        //a = (NazwanyPunkt) b;  //   --- powoduje błąd wykonania   (dlaczego ?)

        a = c;                 //--- powoduje błąd kompilacji  (dlaczego ?)
        a = (NazwanyPunkt) c;
        a.show();
    }
}

class Punkt
{
    Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void show()
    {
        System.out.println("<" + x + ", " + y + ">");
    }

    public int x()
    {
        return x;
    }

    public int y()
    {
        return y;
    }

    private int x, y;
}

class NazwanyPunkt extends Punkt
{
    NazwanyPunkt(int x, int y, String name)
    {
        super(x, y);
        this.name = name;
    }

    public void show()
    {
        System.out.println(name + ":<" + x() + ", " + y() + ">");
    }

    private String name;
}

