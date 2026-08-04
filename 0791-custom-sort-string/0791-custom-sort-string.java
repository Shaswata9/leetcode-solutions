class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            if (map.containsKey(ch)) {
                while (map.get(ch) > 0) {
                    str.append(ch);
                    map.put(ch, map.get(ch) - 1);
                }
                map.remove(ch);
            }
        }
        for (char ch : map.keySet()) {
            while (map.get(ch) > 0) {
                str.append(ch);
                map.put(ch, map.get(ch) - 1);
            }
            //map.remove(ch);
        }
        return str.toString();
    }
}