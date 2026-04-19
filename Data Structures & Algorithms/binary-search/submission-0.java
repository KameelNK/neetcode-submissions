class Solution {
    public int search(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {

        if (nums[i] == target) return i;
        else if (nums[(nums.length - 1) - i] == target) return ((nums.length - 1) - i);

        }

        return -1;
    }
}
