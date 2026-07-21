class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long total =0;
        for(int num:nums){
            total+=num;
        }
        int need = (int)(total%p);
        if(need==0){
            return 0;
        }
        int curr=0;
        int minLen=n;
        Map<Integer,Integer>map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            curr = (curr+nums[i])%p;
            int rem = (curr-need+p)%p;
            if(map.containsKey(rem)){
                minLen=Math.min(minLen,i-map.get(rem));
            }
            map.put(curr,i);
        }
        return minLen == n ? -1:minLen;
    }
}