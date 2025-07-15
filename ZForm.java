package DSA;

public class ZForm {
    public static void main(String args[]) {
    	 int[][]arr= {{1,2,3,4},{5,6,7,8},{4,5,6,7},{9,10,11,12}};
    	 int row=arr.length;
    	 int col=arr[0].length;
    	 //First Row
    	 int i=0;
    	 for (int j = 0; j <col-1; j++) {
			System.out.print(arr[i][j]+ " ");
		}
    	 //Right Diagonal Element
    	 for (int m = 0; m < row-1; m++) {
				for (int j = 0; j < row; j++) {
					if (m+j==row-1) {
						System.out.print(arr[m][j]+" ");
					}
				}
			}
    	 //Last Row
    	 i=row-1;
    	 for (int j = 0; j <row; j++) {
			System.out.print(arr[i][j]+ " ");
		}
    }
}
