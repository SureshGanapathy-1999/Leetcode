class Solution {
    public int mySqrt(int x) {
        int l = 1;
        int h = x;
        int answer = 1;

        if(x == 0 || x == 1){
            return x;
        }

        while(l <= h){
            int mid = l + (h-l)/2;

            if( (long)mid * mid == x){
                answer = mid;
                break;
            }else if( (long)mid * mid < x){
                answer = mid;
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }
        return answer;
    }
}