class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        int prefix = 0;
        map.put(0,1);
        for(int i = 0;i<nums.length;i++){
            prefix+=nums[i];
            int target=((prefix%k)+k)%k;
            if(map.containsKey(target)){
                count+=map.get(target);
            }
            map.put(target,map.getOrDefault(target,0)+1);
        }
        return count;
    }
}