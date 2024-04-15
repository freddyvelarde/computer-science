#include <iostream>
#include <vector>

using namespace std;

int binary_search(vector<int> nums, int start, int end, int target) {
  if (end >= start) {
    int middle = start + (end - start) / 2;

    if (nums[middle] == target) {
      return middle;
    }

    if (target < nums[middle]) {
      return binary_search(nums, start, middle - 1, target);
    } else {
      return binary_search(nums, middle + 1, end, target);
    }
  }
  return -1;
}

int main() {
  vector<int> nums = {2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 14};

  cout << binary_search(nums, 0, nums.size(), 11) << "\n";

  return 0;
}
