class Solution {
    public int largestPerimeter(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        Arrays.sort(nums);
        int i=nums.length-3;
        int maxSum=0;
        int sum=nums[i]+nums[i+1]+nums[i+2];
        if((nums[i]+nums[i+1])>nums[i+2]){
            maxSum=sum;
        }
        int j=i-1;
        while(j>=0){
            sum+=nums[j];
            sum-=nums[j+3];
            if((nums[j]+nums[j+1])>nums[j+2]){
                maxSum=Math.max(maxSum,sum);
            }
            j--;
        }
        return maxSum;
    }
}