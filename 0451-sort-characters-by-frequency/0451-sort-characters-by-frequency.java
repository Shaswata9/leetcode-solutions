class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Character> list =new ArrayList<>(map.keySet());
        list.sort((a,b)->Integer.compare(map.get(b),map.get(a)));
        StringBuilder sb =new StringBuilder();
        for(char str:list){
            int count = map.get(str);
            while(count>0){
                sb.append(str);
                count--;
            }
        }
        return sb.toString();
    }
}