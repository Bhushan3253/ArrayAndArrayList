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
public class CreateArray {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i]+" ");
        }
        
    }
}
