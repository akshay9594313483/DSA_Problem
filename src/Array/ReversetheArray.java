package Array;

public class ReversetheArray {
    public int[] solve(final int[] A) {
        int n = A.length;
        int []ans = new int[n];
        for(int i = 0; i < n; i++) ans[i] = A[n - i - 1];
        return ans;
    }
}