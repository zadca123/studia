public class TestDomyslny
{
    public static void main(String[] args)
    {
        B b = new B();
    }
}

class A
{
    public A() {} //  bez tego konstruktora domyślnego błąd kompilacji
    public A(int x)
    {
        this.x = x;
    }

    private int x;
}

class B extends A
{
    private int y;
}

