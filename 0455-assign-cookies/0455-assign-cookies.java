class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n=g.length;
        int m=s.length;
        int i=n-1;
        int j=m-1;
        int count=0;
        while(i>=0 && j>=0 ){
            if(g[i]<=s[j]){
                count++;
                i--;
                j--;
            }
            else{
                i--;
            }
        }
        return count;
    }
}