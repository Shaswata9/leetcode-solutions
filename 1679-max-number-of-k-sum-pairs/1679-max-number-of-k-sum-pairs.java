class Solution {
    public int maxOperations(int[] nums, int k) {
        int left = 0;
        int right = nums.length-1;
        int count=0;
        Arrays.sort(nums);
        while(left<right){
            int ans = nums[left]+nums[right];
            if(ans==k){
                count++;
                left++;
                right--;
            }
            else if(ans<k){
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
}