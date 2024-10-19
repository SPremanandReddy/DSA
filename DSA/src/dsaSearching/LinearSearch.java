package dsaSearching;

public class LinearSearch {
	public static int search(int[] arr, int el) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==el) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr= { 10, 39, 45, 47, 50, 15, 23, 32, 25, 49 };
		int searchedEl = 100;
		
		int index=search(arr,searchedEl);
		if(index!=-1) {
			System.out.println("The element is found at index "+index);
		}else {
			System.out.println("The element is not found");
		}
		
	}
}


