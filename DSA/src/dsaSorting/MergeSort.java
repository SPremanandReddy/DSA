package dsaSorting;

import java.util.Arrays;

//divide and conquer algorithmic techinque for sorting
//time complexity is O(nlogn);
public class MergeSort {
	//si - start index , ei- end index
	
//	for n elements, it takes O(n) times for sorting and combining the arrays
	static void conquer(int[] arr, int si, int mid, int ei) {
		int[] mergedArr = new int[ei-si+1];
		int idx1 = si;
		int idx2 = mid+1;
		int x=0;
		while(idx1<= mid && idx2<=ei) {
			if(arr[idx1] <= arr[idx2]) {
				mergedArr[x++] = arr[idx1++];
			}else {
				mergedArr[x++] = arr[idx2++];
			}
		}
		
		while(idx1 <=mid) {
			mergedArr[x++] = arr[idx1++];
		}
		while(idx2 <=ei) {
			mergedArr[x++] = arr[idx2++];
		}
		
		for(int i=0, j=si; i<mergedArr.length; i++, j++) {
			arr[j] = mergedArr[i];
		}
	}
	
//	here it is dividing in every recursion call, so it has complexity of log2n i.e, logn base 2
	static void divide(int arr[], int si, int ei) {
		if(si>=ei) return;

		int mid = si + (ei-si)/2;  // (si+ei)/2
		divide(arr, si, mid);
		divide(arr,mid+1, ei);
		conquer(arr, si, mid, ei);
		
	}
	
	public static void main(String[] args) {
	
		int arr[]= {9,8,6,1,77,45,33,25,96,71,-22,25};
		int length = arr.length;
		divide(arr, 0,length-1);
		System.out.println(Arrays.toString(arr));
	}
}
