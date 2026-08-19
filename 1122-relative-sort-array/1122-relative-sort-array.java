class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> arr = new ArrayList<>();
        for(int num:arr2){
            while(map.get(num)>0){
                arr.add(num);
                map.put(num,map.get(num)-1);
            }
            map.remove(num);
        }
        List<Integer> remaining = new ArrayList<>(map.keySet());
        Collections.sort(remaining);
        for(int num:remaining){
            while(map.get(num)>0){
                arr.add(num);
                map.put(num,map.get(num)-1);
            }
            map.remove(num);
        }
        int[] res= new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            res[i]=arr.get(i);
        }
        return res;
    }
}