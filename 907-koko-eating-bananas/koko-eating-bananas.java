class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;
        int max = piles[0];

        for(int i = 1 ; i < n ; i++){
            max = Math.max(max, piles[i]);
        }

        int low = 1;
        int high = max;
        int answer = max;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(check(piles,h,mid)){
                answer = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return answer;
    }

    public boolean check(int [] arr , int h , int k){
        int n = arr.length;
        long sum = 0;

        for(int i = 0; i < n ; i++){

            sum += (arr[i] + (long)k - 1)/k;
        }

        if(sum <= h){
            return true;
        }

        return false;
    }
}