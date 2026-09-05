class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        int open = 0;
        int close = 0;
        String str = "";
        generate(n , open , close , str);
        return ans;
    }

    public void generate(int n ,int open ,int close, String str){
        if(open == n && close == n){
            ans.add(str);
            return;
        }

        if(open < n){
            generate(n , open + 1 , close , str + "(");
        }

        if(close < open){
            generate(n , open , close + 1 , str + ")");
        }
    }
}