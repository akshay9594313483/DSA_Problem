package Array;

public class SecondLargestNumber {
        public int solve (int A[]){
            int index = 0, n = A.length;
            for (int i = 1; i < n; i++) {
                if (A[i] > A[index]) {
                    index = i;
                }
            }
            int ans = -1;
            for (int i = 0; i < n; i++) {
                if(i != index){
                    ans = Math.max(ans, A[i]);
                }
            }
            return ans;
        }
    }

