class Solution {
    public int[] searchRange(int[] nums, int target) {

        int left = searchLeft(nums, target);
        int right = searchRight(nums, target);

        return new int []{left,right};
    }

    public int searchLeft(int [] arr , int k){
        int n = arr.length;
        int l = 0;
        int h = n-1;
        int answer = -1;

        while(l <= h){
            int mid = l + (h - l)/2;

            if(arr[mid] == k){
                answer = mid;
                h = mid - 1;
            }else if (arr[mid] < k){
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }

        return answer;
    }

    public int searchRight(int [] arr , int k){
        int n = arr.length;
        int l = 0;
        int h = n - 1;
        int answer = -1;

        while(l <= h){

            int mid = l + (h - l)/2;

            if(arr[mid] == k){
                answer = mid;
                l = mid + 1;
            }else if(arr[mid] < k){
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }
        return answer;
    }
}