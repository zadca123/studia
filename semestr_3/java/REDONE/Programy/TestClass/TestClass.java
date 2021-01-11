import java.util.Date;

public class TestClass
{
    public static void main(String[] args)
    {
        String s = "Java";
        Class c = s.getClass();
        System.out.println(c);

        String className = "java.util.Date";
        try {
            c = Class.forName(className);
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(Date.class);
        System.out.println(int.class);
        System.out.println(Double[].class);

    }
}

