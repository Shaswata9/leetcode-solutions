class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        for (int num : weights) {
            max = Math.max(max, num);
            sum += num;
        }
        int left = max;
        int right = sum;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int noOfDays = 1;
            int currentWeight = 0;
            for (int num : weights) {
                if (currentWeight + num <= mid) {
                    currentWeight += num;
                } else {
                    noOfDays++;
                    currentWeight = num;
                }
            }
            if (noOfDays <= days) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}