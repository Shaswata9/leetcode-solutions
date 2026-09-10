class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int max = 0;
        for (int num : quantities) {
            max = Math.max(max, num);
        }
        int left = 1;
        int right = max;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int store = 0;
            for (int num : quantities) {
                store += ((num + mid - 1) / mid);
            }
            if (store <= n) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}