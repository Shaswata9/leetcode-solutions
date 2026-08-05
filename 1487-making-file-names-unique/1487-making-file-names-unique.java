class Solution {
    public String[] getFolderNames(String[] names) {
        Map<String,Integer> map = new HashMap<>();
        for(int i =0;i<names.length;i++){
            if(!map.containsKey(names[i])){
                map.put(names[i],1);
            }
            else{
                int k = map.get(names[i]);
                while(map.containsKey(names[i]+"("+k+")")){
                    k++;
                }
                map.put(names[i],k+1);
                names[i]=names[i]+"("+k+")";
                map.put(names[i],1);
            }
        }
        return names;
    }
}