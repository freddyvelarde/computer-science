export default function insertionSort(nums: number[]): number[] {
  for (let i = 1; i < nums.length; i++) {
    let key = nums[i];
    let j = i - 1;

    // if you want to sort the arr in a decresed way just make "nums[j] < key"
    while (j >= 0 && nums[j] > key) {
      nums[j + 1] = nums[j];
      j--;
    }
    nums[j + 1] = key;
  }
  return nums;
}
