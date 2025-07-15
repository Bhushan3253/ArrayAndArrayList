package DSA;

public class BoundaryElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[][]arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
          int row=arr.length;
          int col=arr[0].length;
          for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(i==0||j==0||i==row-1||j==col-1) {
					System.out.print(arr[i][j]+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
