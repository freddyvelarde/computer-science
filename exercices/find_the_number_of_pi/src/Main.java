import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random random = new Random(1);
    int n = 111000000;
    int numsInCircle = 0;

    for (int i = 0; i < n; i++) {
      double x = random.nextDouble();
      double y = random.nextDouble();
      double point = findLong(x, y);

      if (point < 1) {
        numsInCircle++;
      }
    }
    double pi = (4.0 * numsInCircle) / n;
    System.out.println(pi);
  }

  static double findLong(double x, double y) {
    return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
  }
}
