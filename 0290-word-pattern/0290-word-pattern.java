class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (pattern.length() != str.length) {
            return false;
        }
        Map<Character, String> mapPS = new HashMap<>();
        Map<String, Character> mapSP = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char chP = pattern.charAt(i);
            String word = str[i];
            if (!mapPS.containsKey(chP)) {
                mapPS.put(chP, word);
            }
            if (!mapSP.containsKey(word)) {
                mapSP.put(word, chP);
            }
            if (!mapPS.get(chP).equals(word) || !mapSP.get(word).equals(chP)) {
                return false;
            }
        }
        return true;
    }
}