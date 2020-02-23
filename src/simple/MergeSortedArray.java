package simple;

/**
 * @apiNote 合并两个有序升序的整数数组A和B变成一个新的数组。新数组也要有序。
 * @author zeekling
 * @version 1.0
 * @since 2019-12-12
 */
public class MergeSortedArray{

	/**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
	 public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int size = A.length + B.length;
        int[] result = new int[size];
        int ia = 0,ib = 0, ir = 0;
        while (ia < A.length && ib < B.length ){
            if (A[ia] <= B[ib]){
                result[ir++] = A[ia++];
            }else {
                result[ir++] = B[ib++];
            }
        }
        while (ia < A.length){
            result[ir++] = A[ia++];
        }
        while(ib < B.length){
            result[ir++] = B[ib++];
        }
        return result;
    }


	public static void main(String[] args){
		int a[] = {1,2};
		int b[] = {2,3};
		MergeSortedArray m = new MergeSortedArray();
		int[] c = m.mergeSortedArray(a, b);
		for (int i=0;i<c.length;i++){
			System.out.print(c[i] + "\t");
		}
	}
}
