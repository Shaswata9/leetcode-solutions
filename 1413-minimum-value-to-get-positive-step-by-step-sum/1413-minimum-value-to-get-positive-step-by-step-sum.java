class Solution {
    public int minStartValue(int[] nums) {
        int prefix=0;
        int min=0;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            min=Math.min(min,prefix);
        }
        return 1-min;
    }
}