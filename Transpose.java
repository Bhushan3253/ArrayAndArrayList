package DSA;


public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
          int row=arr.length;
          int col=arr[0].length;
          for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
          
	}

}
