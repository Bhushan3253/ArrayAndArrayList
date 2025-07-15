/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayQuestions;

/**
 *
 * @author HP
 */
 public class ArrayEvenOdd {
     public static void main(String[] args) {
         int arr[]={1,2,3,4,5,6,7,8};
         int even_sum=0;
         int odd_sum=0;
         for(int i=0;i<arr.length;i++){
             if(arr[i]%2==0)
                 even_sum+=arr[i];
             else
                 odd_sum+=arr[i];
         }
         System.out.println(even_sum+"  "+odd_sum);
     }
   
}
