package DataStructure.Algorithms;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
/***
 * https://leetcode.com/problems/flipping-an-image/description/
 * @author rubin
 *
 */

public class flippingAnImage {
	
	@Test
	public void testFlipAndInvertImage() {
		
		int[] row1 = new int[] {1,1,0};
		int[] row2 = new int[] {1,0,1};
		int[] row3 = new int[] {0,0,0};
		int[] row_1 = new int[] {1,0,0};
		int[] row_2 = new int[] {0,1,0};
		int[] row_3 = new int[] {1,1,1};
		int[][] expected = new int[][] {row_1,row_2,row_3};
		
		int[][] result = flipAndInvertImage(new int[][] {row1,row2,row3});
		assertArrayEquals(expected[0], result[0]);
		assertArrayEquals(expected[1], result[1]);
		assertArrayEquals(expected[2], result[2]);
	}
	
    public int[][] flipAndInvertImage(int[][] A) {
        
        for (int i = 0; i < A.length; i++){
            reverseArray(A[i], 0, A[i].length-1);
        }
        return A;
    }
    
    //reverse integer array and flip using xor
    public void reverseArray(int[] elementArray, int start, int end){
        
        int temp;
        if(start == end){
            elementArray[start] = elementArray[start]^1;
            start++;end--;
            return;
        }
        if(start>end)
            return;
        temp = elementArray[start];
        
        elementArray[start] = elementArray[end]^1;
        elementArray[end] = temp^1;
        
        reverseArray(elementArray, start+1, end-1);
        
    }

}
