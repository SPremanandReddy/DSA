package dsaSearching;

import java.util.Arrays;

public class BinarySearchByRecursion {
	
	public static int search(int arr[], int el,int low, int high) {
		if(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==el) {
				return mid;
			}else if(arr[mid]<el) {
				return search(arr,el,mid+1,high);
			}else {
				return search(arr,el,low,mid-1);
			}
		}
		return -1;
	}
//	binary search has to be sorted, then the search begins
	public static void main(String[] args) {
		int[] arrayOfElements = { 10, 15, 23, 25, 32, 39, 45, 47, 49, 50 };
		int elementToBeSearched = 50;
		int start,end;
		start=0;
		end=arrayOfElements.length-1;
		Arrays.sort(arrayOfElements);
//		System.out.println(Arrays.toString(arrayOfElements));
		int index=search(arrayOfElements,elementToBeSearched,start,end);
		if(index!=-1) {
			System.out.println("founded element index is "+index);
		}else {
			System.out.println("element is not found");
		}
	}
}


//Worst case:
//
//Let us assume that the searching of element will stop after k iterations. In the previous example, the search stops after 4 iterations, so, k is 4 in case of the previous example.
//
//Let us assume that the length of the array is n.
//
//At each iteration, the array is divided by half.
//
//For the 1st iteration, length of the array = n
//
//For the 2nd iteration, length of the array = n / 2
//
//For the 3rd iteration, length of the array = (n / 2) / 2 = n / 22
//
//.......
//
//.......
//
//.......
//
//Therefore, after kth iteration, length of the array = n / 2k
//
//Also, after kth division, the length of the array becomes 1.
//
//Therefore, length of the array = n/2k = 1, i.e., n = 2k
//
//After applying the log function on both sides,
//
//log2(n) =  log2(2k)
//
//log2(n) = klog2(2)
//
//log2(n)  = k (as logx(x) = 1)
//
//Hence, the time complexity of binary search is log2(n).