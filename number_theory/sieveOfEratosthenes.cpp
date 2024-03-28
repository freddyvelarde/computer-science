#include <cmath>
#include <iostream>
#include <vector>

using namespace std;

vector<long long> sieve_of_eratosthenes(int n) {
  // assuming that all numbers from 0 to n are potencial "primes".
  vector<bool> sieve(n + 1, true);
  vector<long long> primes; // here will be the real prime numbers.

  sieve[0] = sieve[1] = false;

  for (int p = 2; p * p <= n; ++p) {
    if (sieve[p]) {
      for (int i = p * p; i <= n; i += p) {
        sieve[i] = false;
      }
    }
  }

  for (int i = 2; i <= n; ++i) {
    if (sieve[i]) {

      // cout << i << "\n";
      primes.push_back(i);
    }
  }
  return primes;
}

bool isPrime(int n, vector<long long> &primes) {
  if (n <= 1)
    return false;

  for (long long prime : primes) {
    if (prime * prime > n)
      break;
    if (n % prime == 0)
      return false;
  }
  primes.push_back(n);
  return true;
}

int main() {
  long long limit = 10000000;

  vector<long long> primes = sieve_of_eratosthenes(limit);
  int n;
  cin >> n;

  for (int i = 0; i < n; ++i) {
    int a, b;
    cin >> a;
    cin >> b;

    int counter = 0;
    for (long long prime : primes) {
      if (prime > b)
        break;
      if (prime >= a && prime <= b) {
        counter++;
      }
    }
    cout << counter << endl;
  }
  return 0;
}
