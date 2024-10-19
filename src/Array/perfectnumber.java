package Array;

import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int n = 1;
        while(n <= N)
        {
            int A = sc.nextInt();

            int sum = 0;
            int i = 1;

            while(i < A) {
                if(A % i == 0){
                    sum += i;
                }
                i++;
            }

            if(sum == A){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            n++;
        }
    }
}