class Solution {
    public int[] singleNumber(int[] nums) {

        int ans [] = new int [2];

        int xor = 0;

        for(int i = 0 ; i < nums.length; i++){
            xor = xor ^ nums[i];
        }

        int pos = 0;
        for(int i = 0 ; i < 32 ; i++){
            if((xor & (1 << i)) != 0){
                pos = i;
                break;
            }
        }

        int num1= 0;
        int num2 = 0;

        for(int i = 0; i < nums.length; i++){
            if( (nums[i] & (1 << pos)) !=0 ){
                num1 = nums[i] ^ num1;
                ans[0] = num1;
            }else{
                num2 = nums[i] ^ num2;
                ans[1] = num2;
            }
        }
        return ans;
    }
}