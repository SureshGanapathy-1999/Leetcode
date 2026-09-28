class Solution {
    public boolean isPalindrome(String s) {

        int p1 = 0; 
        int p2 = s.length() - 1 ;

        while(p1 < p2){
            
            while(p1 < p2 && !isCharRange(s.charAt(p1))){
                p1++;
            } 

             while(p1 < p2 && !isCharRange(s.charAt(p2))){
                p2--;
            }

            char left = toLower(s.charAt(p1));
            char right = toLower(s.charAt(p2));

            if(left != right){
                return false;
            }
            p1++;
            p2--;
        }

        return true;        
    }

    public boolean isCharRange(char ch){
        if(ch >= 'A' && ch <= 'Z'){
            return true;
        }

        if(ch >= 'a' && ch <= 'z'){
            return true;
        }

        if(ch >= '0' && ch <= '9'){
            return true;
        }

        return false;
    }

    public char toLower(char ch){
        if(ch >= 'A' && ch <= 'Z'){
            return (char)(ch + 32);
        }

        return ch;
    }
}

