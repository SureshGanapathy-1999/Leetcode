import java.util.*;

class Solution {
    public int countPrimes(int n) {

        if(n == 0 || n == 1){
            return 0;
        }

        boolean [] ans = new boolean [n + 1];

        Arrays.fill(ans, true);

        for(int i = 2 ; i * i < n ; i++){

            if(ans[i]){

                for(int j = i * i ; j < n ; j+= i){
                    ans[j] = false;
                }
            }
        }

        int count = 0;

        for(int i = 2 ; i < n ; i++){
            if(ans[i]){
                count++;
            }
        }

        return count;
    }
}