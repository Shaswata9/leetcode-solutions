class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total =0;
        for(int num:nums){
            total+=num;
        }
        int leftSum=0;
        int[] res=new int[nums.length];
        for(int i =0;i<nums.length;i++){
            total-= nums[i];
            res[i]=Math.abs(total-leftSum);
            leftSum+=nums[i];
        }
        return res;
    }
}