class Solution {
    public int majorityElement(int[] nums) {
        int checkLen = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > checkLen) {
                return num;
            }
        }
        return -1;
    }
}