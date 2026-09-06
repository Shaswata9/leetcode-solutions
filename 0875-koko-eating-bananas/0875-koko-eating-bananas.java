class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        int n = piles.length;
        int min = 1;
        int minAns = max;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += ((long) (piles[i] + mid - 1) / mid);
            }
            if (sum <= h) {
                minAns = Math.min(minAns, mid);
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return minAns;
    }
}