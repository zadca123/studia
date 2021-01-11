public class TestPrimitiveArguments {
  
  public static void main(String[] args) {
    int a = 3, b = 5;
    System.out.println("Przed zamianą: a == " + a + " b == " + b);
    zamiana(a, b);
    System.out.println("Po zamianie:   a == " + a + " b == " + b);
  }

  public static void zamiana(int a, int b) {
    int tmp = a;
    a = b;
    b = tmp;
  }

}

