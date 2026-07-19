class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int prefix=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            if(prefix==0){
                count++;
            }
        }
        return count;
    }
}