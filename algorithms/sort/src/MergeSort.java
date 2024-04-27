public class MergeSort {
  static void merge(int nums[], int left, int middle, int right) {
    int leftIdx = middle - left + 1;
    int rightIdx = right - middle;

    int L[] = new int[leftIdx];
    int M[] = new int[rightIdx];

    for (int i = 0; i < leftIdx; i++)
      L[i] = nums[left + i];

    for (int j = 0; j < rightIdx; j++)
      M[j] = nums[middle + 1 + j];

    int i, j, k;
    i = 0;
    j = 0;
    k = left;

    while (i < leftIdx && j < rightIdx) {
      if (L[i] <= M[j]) {
        nums[k] = L[i];
        i++;
      } else {
        nums[k] = M[j];
        j++;
      }
      k++;
    }

    while (i < leftIdx) {
      nums[k] = L[i];
      i++;
      k++;
    }

    while (j < rightIdx) {
      nums[k] = M[j];
      j++;
      k++;
    }
  }

  static void mergeSort(int nums[], int left, int right) {
    if (left < right) {
      int middle = (left + right) / 2;

      mergeSort(nums, left, middle);
      mergeSort(nums, middle + 1, right);

      merge(nums, left, middle, right);
    }
  }

  public static void main(String args[]) {
    int nums[] = {4, 3, 5, 2, 6, 1, 7};
    mergeSort(nums, 0, nums.length - 1);
    for (int n : nums) {
      System.out.println(n);
    }
  }
}
