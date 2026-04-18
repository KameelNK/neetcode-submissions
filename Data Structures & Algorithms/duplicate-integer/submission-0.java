class Solution {

    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> checker = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (checker.contains(nums[i])) {
                return true;
            }
            else {
                checker.add(nums[i]);
            }
        }
        return false;
    }
}
