class Solution {
    public int[] sortedSquares(int[] nums) {
        int left =0;
        int right = nums.length-1;
        int trace=nums.length-1;
        int[] result = new int[nums.length];
        while(left<right){
            int l=nums[left]*nums[left];
            int r=nums[right]*nums[right];
            if(l<r){
                result[trace--]=r;
                right--;
            }
            else{
                result[trace--]=l;
                left++;
            }
        }
        result[0]=nums[left]*nums[right];
        return result;
    }
}