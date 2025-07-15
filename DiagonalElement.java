package DSA;

public class DiagonalElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
               int row=arr.length;
               int col=arr[0].length;
               System.out.println("Left Diagonal Element:");
               for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (i==j) {
						System.out.print(arr[i][j]+" ");
					}
				}
			}
               System.out.println();
               System.out.println("Right Diagonal Element:");
               for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (i+j==arr.length-1) {
						System.out.print(arr[i][j]+" ");
					}
				}
			}
	}

}
