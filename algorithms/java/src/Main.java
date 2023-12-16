public class Main {
  public static void main(String[] args) {
    InsertionSort a = new InsertionSort();
    int[] nums = {5, 2, 4, 6, 1, 3};

    a.insertionSort(nums);

    for (int num : nums) {
      System.out.println(num + " ");
    }
  }
}
