/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayQuestions;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ArrayListExampple {
    public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list.get(2));
        list.set(0,8);
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
    }
    
}
