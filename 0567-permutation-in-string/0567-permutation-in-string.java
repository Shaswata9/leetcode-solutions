class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] freq1 = new int[26];
        for(char ch:s1.toCharArray()){
            freq1[ch-'a']++;
        }
        int[] freq2 = new int[26];
        for(int i=0;i<s1.length();i++){
            freq2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)){
            return true;
        }
        int j=s1.length();
        while(j<s2.length()){
            freq2[s2.charAt(j)-'a']++;
            freq2[s2.charAt(j-s1.length())-'a']--;
            if(Arrays.equals(freq1,freq2)){
                return true;
            }
            j++;
        }
        return false;

    }
}