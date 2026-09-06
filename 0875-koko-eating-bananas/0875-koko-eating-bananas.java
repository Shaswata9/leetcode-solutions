class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        int min = 1;
        int max = piles[n-1];
        int minAns=piles[n-1];
        while(min<=max){
            int mid = min+(max-min)/2;
            long sum=0;
            for(int i=0;i<n;i++){
                sum+=((piles[i]+mid-1)/mid);
            }
            if(sum<=h){
                minAns=Math.min(minAns,mid);
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return minAns;
    }
}