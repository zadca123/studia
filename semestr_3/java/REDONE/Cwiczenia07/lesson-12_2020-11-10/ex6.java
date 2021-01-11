// import pl.imiajd.Salwowski.Rectangle;
import java.awt.Rectangle;
import pl.imiajd.Salwowski.BetterRectangle;

public class ex6 {
    public static void main(String[] args) {
        BetterRectangle r1 = new BetterRectangle(3,3,2,2);
        BetterRectangle r2 = new BetterRectangle(4,4,4,6);

        r1.getPerimeter();
        System.out.println(r1);

        System.out.println();

        r2.getPerimeter();
        System.out.println(r2);
    }
}
