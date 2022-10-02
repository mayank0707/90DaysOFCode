import java.util.Arrays;

public class SortingByRecursion {

	public static void main(String[] args) {
		int[] arr= {4,5,-2,3,-1};
		selectionSort(arr,arr.length,0,0);
		System.out.println(Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr, int row, int col, int maxIndex) {
		if(row==0) {
			return ;
		}
		if(col<row) {
			if(arr[col]>arr[maxIndex]) {
				selectionSort(arr,row,col+1,col);
			}
			else {
				selectionSort(arr,row,col+1,maxIndex);
			}
		}
		else {
			int temp=arr[maxIndex];
			arr[maxIndex]=arr[col-1];
			arr[col-1]=temp;
			selectionSort(arr,row-1,0,0);
		}
	}

}
