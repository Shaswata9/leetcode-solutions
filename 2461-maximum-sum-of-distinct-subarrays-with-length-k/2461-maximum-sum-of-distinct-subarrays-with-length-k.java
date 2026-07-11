class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map =new HashMap<>();
        long sum=0;
        long max=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size()==k){
            max=Math.max(max,sum);
        }
        int right=k;
        while(right<nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            sum+=nums[right];
            sum-=nums[right-k];
            map.put(nums[right-k],map.get(nums[right-k])-1);
            if(map.get(nums[right-k])==0){
                map.remove(nums[right-k]);
            }
            if(map.size()==k){
                max=Math.max(max,sum);
            }
            right++;
        }
        return max;
    }
}