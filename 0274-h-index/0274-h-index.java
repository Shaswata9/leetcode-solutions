class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            int ele = citations.length-i;
            if(citations[i]>=ele){
                return ele;
            }
        }
        return 0;
    }
}