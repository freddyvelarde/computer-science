import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    int nums[] = {2, 3, 4, 5, 6, 7, 8, 9};

    System.out.println(binarySeach(nums, 0, nums.length, 4));
  }

  // O(log(n)) -> if n = 11 then log_2(11) = 4;
  public static int binarySeach(int[] nums, int start, int end, int target) {
    if (end >= start) {

      int middle = start + (end - start) / 2;
      if (nums[middle] == target) {
        return middle;
      }

      if (nums[middle] > target) {
        return binarySeach(nums, start, middle - 1, target);
      } else {
        return binarySeach(nums, middle + 1, end, target);
      }
    }
    return -1;
  }
}
