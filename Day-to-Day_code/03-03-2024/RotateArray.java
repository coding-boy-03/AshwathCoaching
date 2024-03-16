/*
 * Rotate Array in Java
You may have been using Java for a while. Do you think a simple Java array question
can be a challenge? Let’s use the following problem to test.
Problem: Rotate an array of n elements to the right by k steps. For example, with n
= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. How many different
ways do you know to solve this problem?
 */
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k %= nums.length;
        }
        int result[] = new int[nums.length];

        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }

        System.arraycopy(result, 0, nums, 0, nums.length);
    }

    public static void printNums(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void AntiClock(int[] nums, int k) {
        if (k > nums.length) {
            k %= nums.length;
        }

        int result[] = new int[nums.length];

        for (int i = 0; i < k; i++) {
            result[nums.length - k + i] = nums[i];
        }
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[j] = nums[i];
            j++;
        }

        System.arraycopy(result, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(nums, k);
        printNums(nums);
        System.out.println(" ");
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int j = 3;
        AntiClock(arr, j);
        printNums(arr);
    }

}
