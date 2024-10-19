package dsaSearching;

import java.util.Arrays;

public class BinarySearch {
	
	public static int search(int arr[], int el) {
		int start,end,mid;
		start=0;
		end=arr.length-1;
		while(start<=end) {
			mid=(start+end)/2;
			if(arr[mid]==el) {
				return mid;
			}else if(arr[mid]<el) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}
//	binary search has to be sorted, then the search begins
	public static void main(String[] args) {
//		here, we have already taken an sorted array, if not, it should be sorted first
		int[] arrayOfElements = { 10, 15, 23, 25, 32, 39, 45, 47, 49, 50 };
		int elementToBeSearched = 50;
		Arrays.sort(arrayOfElements);
//		System.out.println(Arrays.toString(arrayOfElements));
		int index=search(arrayOfElements,elementToBeSearched);
		if(index!=-1) {
			System.out.println("founded element index is "+index);
		}else {
			System.out.println("element is not found");
		}
	}
}

