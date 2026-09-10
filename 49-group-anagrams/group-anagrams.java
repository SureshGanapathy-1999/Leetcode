class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        // Loop through every string
        for (int i = 0; i < strs.length; i++) {

            String str = strs[i];

            // Convert string to character array
            char[] chars = str.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Convert sorted characters back to String
            String key = new String(chars);

            // If key doesn't exist, create a new ArrayList
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add original string to the corresponding group
            map.get(key).add(str);
        }

        // Create final answer
        List<List<String>> ans = new ArrayList<>();

        // Iterate through all values of HashMap
        for (List<String> list : map.values()) {
            ans.add(list);
        }

        return ans;
    }
}