package dsaArray;
import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int arr[] = new  int[6];
		arr[0]=4;
		arr[1]=2;
		arr[2]=88;
		arr[3]=75;
		arr[4]=34;
		
//		insertions -- a lot of shift operations and incase array is full. loss of data.
		
		int newValue  = 33,index=2;
		for(int i=arr.length-1; i>index; i--) {
			arr[i]=arr[i-1];
		}
		arr[index]=newValue;
		System.out.println(Arrays.toString(arr));
		
//		now the array is full right. let add 66 at 1 index
//		loss of data when we try to add the data when the array is full
		newValue  = 44;
		index=1;
		for(int i=arr.length-1; i>index; i--) {
			arr[i]=arr[i-1];
		}
		arr[index]=newValue;
		System.out.println(Arrays.toString(arr));
		
		
//		deletion -- a lot of shift operations and wastage of memory
		
		int deleteIndex=2;
		for(int i=deleteIndex; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] =0;
		System.out.println(Arrays.toString(arr));
	}
}
