class Solution {
    public int findMinDifference(List<String> timepoints) {
        int n = timepoints.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(timepoints.get(i).substring(0, 2));
            int b = Integer.parseInt(timepoints.get(i).substring(3, 5)); 
            // System.out.println(a);
            // System.out.println(b);
            arr[i] = a*60+b;
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int dif = Math.min(arr[i]+1440-arr[j],arr[j]-arr[i]);
                if(dif < min){
                    min = dif;
                }
            }
            
        }
        return min;
    }
}