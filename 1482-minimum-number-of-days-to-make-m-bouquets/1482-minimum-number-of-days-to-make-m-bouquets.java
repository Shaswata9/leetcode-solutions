class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int day : bloomDay) {
            max = Math.max(max, day);
            min = Math.min(min, day);
        }
        int left = min;
        int right = max;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int consecutive = 0;
            int bouquet = 0;
            for (int day : bloomDay) {
                if (day <= mid) {
                    consecutive++;
                    if (consecutive == k) {
                        bouquet++;
                        consecutive = 0;
                    }
                } else {
                    consecutive = 0;
                }
            }
            if (bouquet >= m) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}