package Array;

public class MINIMUMPICKS {
    public int solve(int[]A){
        int maxx= Integer.MIN_VALUE;
        int minn= Integer.MIN_VALUE;
        for (int i=0;i<A.length;i++){
            if(A[i] % 2== 0)
                maxx = Math.max(A[i], maxx);
 else
     minn = Math.min(A[i], minn);
        }
        return maxx - minn;
        }
    }

