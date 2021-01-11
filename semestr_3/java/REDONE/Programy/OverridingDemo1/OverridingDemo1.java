public class OverridingDemo1
{
    public static void main(String[] args)
    {
        Object[] tab = { new Punkt(3, 5), new Punkt(3, 5) };
        System.out.println(tab[0].equals(tab[1]));
    }
}

class Punkt
{
    Punkt(int x, int y)
    {
        this.x  = x;
        this.y = y;
    }

    @Override public boolean equals(Punkt b)
    {
        return b.x == x && b.y == y;
    }

    private final int x;
    private final int y;
}

