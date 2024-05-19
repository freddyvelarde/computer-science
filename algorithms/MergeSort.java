public class MergeSort {
  public static void main(String[] args) {
    int[] nums = {4, 3, 5, 2, 6, 1, 7};

    System.out.println("Unsorted array: ");
    for (int num : nums) {
      System.out.print(num + " ");
    }
    System.out.println();

    mergeSort(nums, 0, nums.length - 1);
    System.out.println("Sorted array: ");
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }

  static void mergeSort(int[] nums, int left, int right) {
    if (left < right) {
      int mid = left + (right - left) / 2;
      mergeSort(nums, left, mid);
      mergeSort(nums, mid + 1, right);
      merge(nums, left, mid, right);
    }
  }

  static void merge(int[] nums, int left, int mid, int right) {
    int leftSize = mid - left + 1;
    int rightSize = right - mid;

    int[] leftArr = new int[leftSize];
    int[] rightArr = new int[rightSize];

    System.arraycopy(nums, left, leftArr, 0, leftSize);
    System.arraycopy(nums, mid + 1, rightArr, 0, rightSize);

    int i = 0, j = 0, k = left;
    while (i < leftSize && j < rightSize) {
      if (leftArr[i] <= rightArr[j]) {
        nums[k++] = leftArr[i++];
      } else {
        nums[k++] = rightArr[j++];
      }
    }

    while (i < leftSize) {
      nums[k++] = leftArr[i++];
    }

    while (j < rightSize) {
      nums[k++] = rightArr[j++];
    }
  }
}
