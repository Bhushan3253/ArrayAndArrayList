package DSA;

public class FLIndexOfTargetElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int[]arr= {3,4,5,6,7,8,8,10};
              int target=8;
              int first=-1;
              int last=-1;
              for (int i = 0; i < arr.length; i++) {
				  if(arr[i]==target)
				  {
					  first=i;
					  break;
				  }
			}
              for (int i = arr.length-1; i > 0; i--) {
            	  if(arr[i]==target)
				  {
					  last=i;
					  break;
				  }
			}
              System.out.print(first+"  "+ last);
	}

}
