import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo
{
    public static void main(String[] args)
    {
        NumberFormat currencyFormatter =
            NumberFormat.getCurrencyInstance(new Locale("en", "GB"));
        
        NumberFormat percentFormatter = 
            NumberFormat.getPercentInstance(new Locale("en", "GB"));

        double x = 0.1;

        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));

        currencyFormatter = NumberFormat.getCurrencyInstance();
        percentFormatter = NumberFormat.getPercentInstance();

        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));

    }
}

