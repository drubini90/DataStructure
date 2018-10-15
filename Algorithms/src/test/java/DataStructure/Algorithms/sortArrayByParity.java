package DataStructure.Algorithms;

import org.junit.Assert;
import org.junit.Test;

public class sortArrayByParity {
	@Test
	public void testSortArrayByParity() {
		int[] result = sortArrayByParity(new int[] {1,2,3,4});
		Assert.assertArrayEquals(new int[] {2,4,3,1}, result);
	}
	public int[] sortArrayByParity(int[] A) {
        
        int inputSize = A.length;
        int[] answer = new int[inputSize];
        int j = 1;
        int k = 0;
        
        for(int i = 0; i<inputSize; i++){
            
            if(A[i]%2 == 0){
                answer[k] = A[i];
                k++;
            }
            else{
                answer[inputSize-j] = A[i];
                j++;
            }
            
        }
        return answer;
    }
}
