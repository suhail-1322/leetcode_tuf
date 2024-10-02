class Solution {
    public int[] arrayRankTransform(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);  
        }
        Collections.sort(list);


        
        Map<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for(int i = 0;i<arr.length;i++){
            if(!map.containsKey(list.get(i))){
                 map.put(list.get(i),rank++);
            }
           
        }

        int[] res = new int[arr.length];

        for(int i = 0;i<arr.length;i++){
            res[i] = map.get(arr[i]);
        }
        return res;

    }
}