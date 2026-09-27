class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int l = 0;
        int sum = 0 ; 
        int answer = 0;

        for(int i = 0; i < n ; i++){
            l = Math.max(l , weights[i]);
            sum += weights[i];
        }

        int h = sum;

        while(l <= h){
            int mid = l + (h - l)/2;

            if(check(weights , days , mid)){
                answer = mid;
                h = mid -1;
            }else{
                l = mid + 1;
            }
        }
        return answer;
    }

    public boolean check(int arr [] , int k , int mid){
        int n = arr.length;
        int day = 1;
        int sum = 0;

        for(int i = 0 ; i < n ; i++){
            
            if(sum + arr[i] > mid){
                day = day + 1;
                sum = arr[i];
            }else{
                sum += arr[i];
            }
        }

        if(day <= k){
            return true;
        }

        return false;
    }
}