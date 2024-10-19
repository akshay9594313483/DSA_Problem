package Array;

import java.util.Scanner;

public class SCALERDSAPractice {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in) ;
    int A= sc.nextInt();
    boolean flag =true;
    for(int i=2; i<A; i++){
        if(A%i==0){
            flag =false;
            break;
            
        }
    }
       if(flag ==true)
           System.out.println("Yes");
           else
               System.out.println("No");
           }
       }
