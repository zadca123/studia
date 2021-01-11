public class TestSuper
{
    public static void main(String[] args)
    {
        A a = new A();
        a.show();
        System.out.println();
        B b = new B();
        b.show();
        System.out.println();
        C c = new C();
        c.show();
        System.out.println();
    }
}

class A
{
    void show()
    {
        System.out.print("A");
    }
}

class B extends A
{
    void show()
    {
        super.show();
        System.out.print("B");
    }
}

class C extends B
{
    void show()
    {
        super.show();
        System.out.print("C");
    }
}

