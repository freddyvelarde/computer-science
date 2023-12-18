public class Main {
  public static void main(String[] args) {
    int[] nums = {5, 2, 4, 6, 1, 3, 7};
    /* InsertionSort a = new InsertionSort(); */
    /* a.insertionSort(nums); */

    /* new MergeSort().mergeSort(nums); */

    new CustomMergeSort().mergeSort(nums, 0, nums.length - 1);

    for (int num : nums) {
      System.out.println(num + " ");
    }
  }
}
