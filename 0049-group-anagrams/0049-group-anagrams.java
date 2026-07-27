class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String word:strs){
            char[] array = word.toCharArray();
            Arrays.sort(array);
            String key = new String(array);

            if(!map.containsKey(key)){
                map.put(key , new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}