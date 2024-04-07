import java.util.ArrayList;
import java.util.List;

class SieveOfEratosthenes {
  static boolean checkPrime(int n) {
    if (n <= 1)
      return false;

    if (n == 2 || n == 3)
      return true;

    if ((n & 1) == 0 || n % 3 == 0)
      return false;

    for (int i = 5; i * i <= n; i += 6) {
      if (n % i == 0 || n % (i + 2) == 0)
        return false;
    }

    return true;
  }

  static void sieveOfEratosthenes(int a, int n) {

    boolean primes[] = new boolean[n + 1];

    for (int i = 2; i * i <= n; i++) {
      if (!primes[i]) {
        for (int p = i * i; p <= n; p += i) {
          primes[p] = true;
        }
      }
    }

    for (int i = a; i <= n; i++) {
      if (!primes[i])
        System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) { sieveOfEratosthenes(50, 100); }
}
