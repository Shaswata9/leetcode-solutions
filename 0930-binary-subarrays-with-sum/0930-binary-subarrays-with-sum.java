class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer> map=new HashMap<>();
        int count =0;
        int prefix=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            int target = prefix-goal;
            if(map.containsKey(target)){
                count+=map.get(target);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}