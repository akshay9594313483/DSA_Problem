package Array;

public class LittlePonnyandMaximumElement {
    public int solve(int[] A, int B) {
        int cnt = 0, flag = 0;
        for(int i : A){
            if(i == B) flag = 1;
            if(i > B) cnt++;
        }
        if(flag==1) return cnt;
        return -1;

    }
}

