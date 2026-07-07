class Solution {
    public boolean isSame(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(p.length()>s.length()){
            return result;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < p.length(); i++) {
            freq2[p.charAt(i) - 'a']++;
        }
        for (int i = 0; i < p.length(); i++) {
            freq1[s.charAt(i) - 'a']++;
        }
        if (isSame(freq1, freq2)) {
            result.add(0);
        }
        int j = p.length();
        while (j < s.length()) {
            freq1[s.charAt(j) - 'a']++;
            freq1[s.charAt(j - p.length()) - 'a']--;
            if (isSame(freq1, freq2)) {
                result.add(j - p.length() + 1);
            }
            j++;
        }
        return result;
    }
}