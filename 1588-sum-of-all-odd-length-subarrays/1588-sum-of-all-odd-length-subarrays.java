class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int ans=0;
        int[] prefix = new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+arr[i];
        }
        for(int len =1;len<=n;len+=2){
            for(int start=0;start+len<=n;start++){
                ans+=prefix[start+len]-prefix[start];
            }
        }
        return ans;
    }
}