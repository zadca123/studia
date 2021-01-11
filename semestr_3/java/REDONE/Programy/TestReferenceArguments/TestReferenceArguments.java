public class TestReferenceArguments {
  
  public static void main(String[] args) {
    Integer a = new Integer(3);
    Integer b = new Integer(5);
    System.out.println("Przed zamianą: a == " + a.intValue() + " b == " + b.intValue());
    zamiana(a, b);
    System.out.println("Po zamianie:   a == " + a.intValue() + " b == " + b.intValue());
  }

  public static void zamiana(Integer a, Integer b) {
    Integer tmp = a;
    a = b;
    b = tmp;
  }

}

