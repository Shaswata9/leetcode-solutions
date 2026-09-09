class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int max = 0;
        for (int ball : nums) {
            max = Math.max(max, ball);
        }
        int left = 1;
        int right = max;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int operations = 0;
            for (int ball : nums) {
                operations += (ball - 1) / mid;
            }
            if (operations <= maxOperations) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}