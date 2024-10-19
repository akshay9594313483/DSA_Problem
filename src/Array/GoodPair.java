package Array;

public class GoodPair {
    public int solve(int[] A, int B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i == j) continue;
                if (A[i] + A[j] == B) return 1;
            }
        }
        return 0;
    }
}