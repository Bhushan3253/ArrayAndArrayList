package DSA;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         long arr1[]=new long[n];
      
         for (int i = 0; i < n; i++) {
			arr1[i]=sc.nextInt();
		}
         long sum=0;
         for (int j = 0; j < n; j++) {
 			sum+=arr1[j];
 		}
       
         System.out.print(sum);
	}

}
  