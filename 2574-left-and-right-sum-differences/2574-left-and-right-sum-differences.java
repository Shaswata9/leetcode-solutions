class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total =0;
        for(int num:nums){
            total+=num;
        }
        int leftSum=0;
        int rightSum=total;
        int[] res=new int[nums.length];
        for(int i =0;i<nums.length;i++){
            rightSum=total-leftSum-nums[i];
            if(rightSum>leftSum){
                res[i]=rightSum-leftSum;
            }
            else{
                res[i]=leftSum-rightSum;
            }
            leftSum+=nums[i];
        }
        return res;
    }
}