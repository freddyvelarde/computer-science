#include <iostream>
using namespace std;

int main() {
  long long x = 1;

  for (int i = 1; i <= n; i++) {
    x = (x * i)%m;
  }

  cout << x << "\n";
}
