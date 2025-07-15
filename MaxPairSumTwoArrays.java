package DSA;

public class MaxPairSumTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr1= {1,2,3,4};
       int[] arr2= {6,7,8,9};
       int max=0;
       for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
			int sum=arr1[i]+arr2[j];
			max=Math.max(max, sum);
		}
	}
       System.out.print(max);
	}

}
