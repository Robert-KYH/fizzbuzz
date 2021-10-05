package kyh.fizzbuzz;

class Main {
  public static void main(String[] args) {

    for (int i = 1; i <= 30; ++i) {
      String s = "";
      if (i%3 == 0)   s += "fizz ";
      if (i%5 == 0)   s += "buzz ";
      if (i%7 == 0)   s += "café ";
      if (i%10 == 0)  s += "espresso ";

      System.out.printf("%2d   %s\n", i, s);
    }
  }
}
