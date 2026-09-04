class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> Str1 = new HashMap<>();
        HashMap<Character,Integer> Str2 = new HashMap<>();

        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Str1.containsKey(ch)){
                Str1.put(ch , (Str1.get(ch)) + 1);
            }else{
                Str1.put(ch, 1);
            }
        }

        for(int i = 0 ; i < t.length(); i++){
            char ch = t.charAt(i);
            if(Str2.containsKey(ch)){
                Str2.put(ch , (Str2.get(ch)) + 1);
            }else{
                Str2.put(ch, 1);
            }
        }

        if(Str1.equals(Str2)){
            return true;
        }else{
            return false;
        }
        
    }
}