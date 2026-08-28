class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;
        int i = 0;

        while(i < n){
            int current = nums[i];

            if(current > 0 && current <= n){

                if(nums[current - 1] != current){
                    int temp = nums[i];
                    nums[i] = nums[current - 1];
                    nums[current - 1] = temp;
                }else{
                    i++;
                }

            }else{
                i++;
            }
        }

        for(int j = 0; j < n; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        
        return n+1;
    }
}