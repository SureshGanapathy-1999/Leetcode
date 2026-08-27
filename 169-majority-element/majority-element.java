class Solution {
    public int majorityElement(int[] A) {
        int n = A.length;
		int ans = n/2;
		int majority_element = A[0];
		int count = 1;
		
		for(int i = 1; i < n; i++){
			
			if(A[i] == majority_element){
				count++;
			}else{
                count--;
            }
			
			if(count == 0){
				majority_element = A[i];
				count = 1;
			}
			
		}
		
		int frequency = 0;
		
		for(int i = 0; i < n ; i++){
			if(A[i] == majority_element){
				frequency++;
			}
 		}
		
		if(frequency > ans){
			return majority_element;
		}
		
		return -1;
        
    }
}