class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int ans [] = new int [k];

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            int num = nums[i];

            if(hm.containsKey(num)){
                hm.put(num, hm.get(num) + 1);
            }else{
                hm.put(num , 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(hm.keySet());

        Collections.sort(list , (a,b) -> hm.get(b) - hm.get(a));

        for(int i = 0 ; i < k ; i++){
            ans[i] = list.get(i);
        }

        return ans;        
    }
}