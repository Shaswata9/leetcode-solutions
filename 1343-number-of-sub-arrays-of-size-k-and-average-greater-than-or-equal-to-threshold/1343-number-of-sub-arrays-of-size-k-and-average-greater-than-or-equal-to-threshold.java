class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int j = k;
        int sum = 0;
        int count = 0;
        for (int p = 0; p < k; p++) {
            sum += arr[p];
        }
        int target = threshold * k;
        if (sum >= target) {
            count++;
        }

        while (j < arr.length) {
            sum += arr[j];
            sum -= arr[j - k];
            if (sum >= target) {
                count++;
            }
            j++;
        }
        return count;
    }
}