class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long total = 0;
        for (int num : nums) {
            total += num;
        }
        long prefix = 0;
        long minDiff = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            prefix += nums[i];
            long leftAvg = prefix / (i + 1);
            long rightAvg = 0;
            if (i != n - 1) {
                rightAvg = (total - prefix) / (n - i - 1);
            }
            long avgDiff = Math.abs(leftAvg - rightAvg);
            if (avgDiff < minDiff) {
                minDiff = avgDiff;
                ans = i;
            }
        }
        return ans;
    }
}