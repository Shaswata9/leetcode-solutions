class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = 0;
        double maxAvg = Double.NEGATIVE_INFINITY;
        int sum = 0;
        while (j < nums.length) {
            sum += nums[j];
            if (j - i + 1 == k) {
                double avg = (double) sum / k;
                maxAvg = Math.max(maxAvg, avg);
                sum = sum - nums[i];
                i++;
                j++;
            } else {
                j++;
            }
        }
        return maxAvg;
    }
}