class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        List<Integer> temp = new ArrayList<>();

        subset(nums , ans , temp , index);
        return ans;
        
    }

    public void subset(int[] nums , List<List<Integer>> ans , List<Integer> temp ,int index){
        if(index == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[index]);
        subset(nums , ans, temp , index + 1);

        temp.remove(temp.size() - 1);
        subset(nums , ans, temp, index + 1);
    }
}