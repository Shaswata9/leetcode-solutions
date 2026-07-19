class Solution {
    public long maximumTripletValue(int[] nums) {
        int len = nums.length;
        int[] leftMax=new int[len];
        int[] rightMax=new int[len];
        long ans=0;
        leftMax[0]=nums[0];
        for(int i=1;i<len;i++){
            leftMax[i]=Math.max(leftMax[i-1],nums[i]);
        }
        rightMax[len-1]=nums[len-1];
        for(int i=len-2;i>=0;i--){
            rightMax[i]=Math.max(nums[i],rightMax[i+1]);
        }
        for(int i=1;i<nums.length-1;i++){
            long res=(long)(leftMax[i-1]-nums[i])*rightMax[i+1];
            ans=Math.max(ans,res);
        }
        return ans;
    }
}