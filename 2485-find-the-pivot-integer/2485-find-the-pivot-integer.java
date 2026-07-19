class Solution {
    public int pivotInteger(int n) {
        int total =n*(n+1)/2;
        int left=0;
        int right=0;
        for(int i=1;i<=n;i++){
            right=total-left-i;
            if(right==left){
                return i;
            }
            left+=i;
        }
        return -1;
    }
}