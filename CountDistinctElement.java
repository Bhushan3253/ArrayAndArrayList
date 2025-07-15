package DSA;

import java.util.Arrays;

public class CountDistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,3,2,1,4};
        boolean vis[]=new boolean[101];
        Arrays.fill(vis, false);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
			if(vis[arr[i]]==false)
				count++;
			vis[arr[i]]=true;
		}
        System.out.print(count);
	}

}
