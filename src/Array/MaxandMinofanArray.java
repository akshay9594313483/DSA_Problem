package Array;

import java.util.Scanner;

public class MaxandMinofanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        int ma = a[0], mi = a[0];
        // looping from 1 to n-1
        for(int i = 1; i < n; i++){
            if(ma < a[i]) ma = a[i];
            if(mi > a[i]) mi = a[i];
        }

        System.out.println(String.valueOf(ma) + ' ' + String.valueOf(mi));
    }
        }



