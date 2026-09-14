class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int ans = 0;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){

            if(hm.containsKey(nums[i])){
                hm.put(nums[i] , hm.get(nums[i]) + 1);
            }else{
                hm.put(nums[i] , 1);
            }
        }

        for(int key : hm.keySet()){

            int freq = hm.get(key);

            if(freq % k == 0){
                ans += key * freq;
            }
        }
        
        return ans;
    }
}