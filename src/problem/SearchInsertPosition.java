package problem;
// https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        if(target > nums[nums.length - 1]) {
            return nums.length;
        }
        for (int i =0; i<nums.length; i++) {
            if(nums[i]>= target){
                index = i;
                break;
            }

        }
        return index;
    }

    public static int searchInsertLogN(int[] nums, int target) {
        int index = 0;
        if(target > nums[nums.length - 1]) {
            return nums.length;
        }
        for (int i =0; i<nums.length; i++) {
            if(nums[i]>= target){
                index = i;
                break;
            }

        }
        return index;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,5,6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }
}
