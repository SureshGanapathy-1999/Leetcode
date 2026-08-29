class Solution {
    public int[][] merge(int[][] intervals) {

        int n = intervals.length;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> ans = new ArrayList<>();

        int[] current = intervals[0];
        
        for(int i = 1 ; i < n ; i++){

            int[] next = intervals[i];

            // check if the end is small than the start of next element
            if(current[1] >= next[0]){
                current[1] = Math.max(current[1], next[1]);
               
            }else{
                ans.add(current);
                current = next;
            }              
            
        }

        ans.add(current);

        return ans.toArray(new int[ans.size()][] );        
    }
}