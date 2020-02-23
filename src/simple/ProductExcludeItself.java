package simple;

import java.util.ArrayList;
import java.util.List;

public class ProductExcludeItself {

	/*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        int n = nums.size();
        long[] left = new long[n];
        long[] right = new long[n];
        for(int i=0;i<n;i++){
            left[i] = 1;
            right[i] = 1;
        }
        ArrayList<Long> res = new ArrayList<>();

        for (int i = 1; i < n; ++i){
            left[i] = left[i-1] * nums.get(i-1);
            right[n-i-1] = right[n-i] * nums.get(n-i);
        }

        for(int i = 0; i != nums.size(); ++i){
            res.add( left[i] * right[i] );
        }
        return res;
    }
}
