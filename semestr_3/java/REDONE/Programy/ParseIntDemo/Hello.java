public class Hello {
    public static void main(String[] args)
    {
        int s = 0;
        for (String a : args) {
            s += Integer.parseInt(a);
        }
        System.out.println(s);
    }
}

