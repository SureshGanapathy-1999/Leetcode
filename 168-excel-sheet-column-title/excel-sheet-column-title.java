class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = "";

        while(columnNumber > 0){

            ans = (char)((columnNumber - 1) % 26 + 'A') + ans;
            columnNumber = (columnNumber - 1 ) / 26;
        }
        return ans;
    }
}