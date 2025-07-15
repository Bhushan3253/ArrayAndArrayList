package DSA;

public class SumOfTripletsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int arr[]= {1,2,3,4};
             for (int i = 0; i < arr.length-2; i++) {
				for (int j = i+1; j < arr.length-1; j++) {
					for (int j2 = j+1; j2 < arr.length; j2++) {
						int sum=arr[i]+arr[j]+arr[j2];
						System.out.println(sum);
					}
				}
			}
 	}

}
