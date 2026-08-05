class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String str : words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)-> {if(!a.getValue().equals(b.getValue())){
                return b.getValue()-a.getValue();
            }
            return a.getKey().compareTo(b.getKey());
        });
        List<String> answer = new ArrayList<>();
        for(int i = 0;i<k;i++){
            answer.add(list.get(i).getKey());
        }
        return answer;
    }
}