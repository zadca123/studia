public class TestRectangle {
  public static void main(String[] argv) {
    Rectangle boisko = new Rectangle(new Point(1, 2), new Point(5, 3), "boisko");
    boisko.getTopLeft().setX(0);
    boisko.show();
    Rectangle basen = new Rectangle(new Point(5, 3), new Point(1, 2), "basen");
    basen.show();
  }
}

