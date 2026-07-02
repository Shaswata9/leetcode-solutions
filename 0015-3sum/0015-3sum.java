class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            int j=i+1;
            int k = nums.length -1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
            }
        }
        result.addAll(s);
        return result;
    }
}