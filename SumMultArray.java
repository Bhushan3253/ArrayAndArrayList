/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayQuestions;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SumMultArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Array element:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int mult=1;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            mult*=arr[i];
        }
        System.out.println("Sum of all Array Element:"+sum);
        System.out.println("Multiplicaton of all Array Element:"+mult);

        
    }
   
}
