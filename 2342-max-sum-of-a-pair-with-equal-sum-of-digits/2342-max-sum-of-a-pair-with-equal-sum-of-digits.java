class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;
        for (int num : nums) {
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (map.containsKey(sum)) {
                maxSum = Math.max(maxSum, map.get(sum) + num);
            }
            map.put(sum, Math.max(map.getOrDefault(sum, 0), num));
        }
        return maxSum;
    }
}