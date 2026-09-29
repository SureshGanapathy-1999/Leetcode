class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int answer = 0;
        int p1 = 0;
        int p2 = n - 1;

        while(p1 < p2){
            answer = Math.max(answer, (p2-p1)* Math.min(height[p1] , height[p2]));

            if(height[p1] < height[p2]){
                p1++;
            }else{
                p2--;
            }
        }
        return answer;
    }
}