public class OverridingDemo2
{
    public static void main(String[] args)
    {
        Object[] tab = { new Punkt(3, 5), new Punkt(3, 5) };
        System.out.println(tab[0].equals(tab[1]));
        System
    }
}

class Punkt
{
    Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override public boolean equals(Object other)
    {
        Punkt innyPunkt = (Punkt) other;
        return innyPunkt.x == x && innyPunkt.y == y;
    }

    private final int x;
    private final int y;
}

