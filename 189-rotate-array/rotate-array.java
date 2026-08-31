class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;

        if(size == 0){
            return;
        }
		
        k = k % size;
        
        if(k == 0){
            return;   
        }       

            reverse(nums,0,size-1);
		    reverse(nums,0, k-1);
		    reverse(nums,k , size -1);

        return;
    }

    public static void reverse(int arr[], int start, int end){
		
		while(start < end ){
		
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		start++;
		end--;
		
		}
		return ;
	}
}