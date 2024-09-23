class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> outer = new ArrayList<>();

        for(int i = 0;i<n;i++){

            int val = 1;
            List<Integer> inner = new ArrayList<>();

            for(int j = 0;j<=i;j++){
                inner.add(val);
                val = val*(i-j)/(j+1);
            }
            outer.add(inner);
        }
        return outer;

    }
}