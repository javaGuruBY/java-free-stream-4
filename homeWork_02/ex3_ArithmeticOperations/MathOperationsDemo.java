public class MathOperationsDemo {

  public static void main(String[] args) {
    Integer a = 5;
    Integer b = 3;
    sum(a, b);
    difference(a, b);
    multiply(a, b);
    quotient(a, b);
  }

  public static int sum(int a, int b) {
    int result = a+b;
    System.out.println("a + b = " + result);
    return result;
  }

  public static int difference(int a, int b) {
    int result = a-b;
    System.out.println("a - b = " + result);
    return result;
  }

  public static int multiply(int a, int b) {
    int result = a*b;
    System.out.println("a x b = " + result);
    return result;
  }

  public static double quotient(int a, int b) {
    double a1 = (double) a;
    double b1 = (double) b;
    double result = a1/b1;
    System.out.println("a : b = " + result);
    return result;
  }

}
