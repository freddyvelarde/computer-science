import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public static void main(String[] args) {
    // int[] nums = {3, 2, 4};
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    solution(nums, target);
  }

  static void solution(int[] nums, int target) {
    HashMap<Integer, Integer> cache = new HashMap<>();

    int[] res = new int[2];
    for (int i = 0; i < nums.length; i++) {
      int n = target - nums[i];
      if (cache.containsKey(n)) {
        res[0] = cache.get(n);
        res[1] = i;
        break;
      } else {
        cache.put(nums[i], i);
      }
    }
    for (int n : res) {
      System.out.println(n);
    }
  }
}
