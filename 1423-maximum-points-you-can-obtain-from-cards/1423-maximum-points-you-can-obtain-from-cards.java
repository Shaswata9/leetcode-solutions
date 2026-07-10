class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int n = cardPoints.length;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        int max = sum;
        int index = k;
        for(int i = n-1;i>=n-k;i--){
            sum+=cardPoints[i];
            sum-=cardPoints[index-1];
            index--;
            max=Math.max(max,sum);
        }
        return max;
    }
}