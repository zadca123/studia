import java.math.BigDecimal;

public class CompareToForBigDecimalDemo
{
    public static void main(String[] args)
    {
        BigDecimal d1 = new BigDecimal("4.0");
        System.out.println("\nd1 == " + d1 + "  scale = " + d1.scale());

        BigDecimal d2 = new BigDecimal("4.00");
        System.out.println("\nd2 == " + d2 + "  scale = " + d2.scale());

        System.out.println("\nd1.compareTo(d2) == " + d1.compareTo(d2));
        System.out.println("\nd1.equals(d2) == " + d1.equals(d2));

        System.out.println();
    }
}

