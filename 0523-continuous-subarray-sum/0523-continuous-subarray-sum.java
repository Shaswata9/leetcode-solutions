class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            int target = ((prefix%k)+k)%k;
            if(map.containsKey(target)){
                if(i-map.get(target)>=2){
                    return true;
                }
            }
            else{
                map.put(target,i);
            }
        }
        return false;
    }
}