package pl.imiajd.Salwowski;

public class NazwanyPunkt extends Punkt
{
    public NazwanyPunkt(int x, int y, String name)
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

