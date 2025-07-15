package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class CountFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {2,3,2,3,5};
         int n=arr.length;
         boolean []vis=new boolean[n];
         Arrays.fill(vis, false);
         for (int i = 0; i < n; i++) {
			if (vis[i]==false) {
				vis[i]=true;
				int count=1;
				for (int j = i+1; j < n; j++) {
					if (arr[i]==arr[j]) {
						vis[j]=true;
						count++;
					}
				}
				System.out.println(arr[i]+"->"+count);
			}
			
		}
	}

}
