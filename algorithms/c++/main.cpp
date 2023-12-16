#include "sortingAlgorithms.h"
#include <iostream>

int main() {
  std::vector<int> arr = {12, 11, 14, 5, 6};

  insertionSort(arr);

  for (int elem : arr) {
    std::cout << elem << std::endl;
  }

  return 0;
}
