#include <iostream>
using namespace std;

unsigned long long factorialIterative(int n) {
    unsigned long long result = 1;
    for (int i = 2; i <= n ; i++) {
        result *= i;
    }
    return result;
}

int main() {
    int n;
    cout << "enter a number: ";
    cin >> n;

    cout << "Factorial of " << n << " is " << factorialIterative(n) << "\n";
    return 0;
}
