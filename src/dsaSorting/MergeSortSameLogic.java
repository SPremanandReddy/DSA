package dsaSorting;

public class MergeSortSameLogic {
			static void displayArray(int[] arr) {
				for(int i: arr) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
			
			public static void merge(int[] arr, int[] left, int[] right, int leftMerge, int rightMerge) {
		        int x=0, y=0,z =0;
		        while(x<leftMerge && y<rightMerge) {
		        	if(left[x] <= right[y]) {
		        		arr[z++] = left[x++];
		        	}else {
		        		arr[z++] = right[y++];
		        	}
		        }
		        
		        while(x<leftMerge) {
		        	arr[z++] = left[x++];
		        }
		        while(y<rightMerge) {
		        	arr[z++] = right[y++];
		        }
		        
		        
			}
			
			static void mergeSort(int[] arr, int size) {
				if(size <2) return ;
				
				int mid = size/2;
				int left[]= new int[mid];
				int right[]= new int[size-mid];
				for(int i=0; i<mid; i++) {
					left[i] = arr[i];
				}
				for(int j=mid; j<size; j++) {
					right[j-mid] = arr[j];
				}
				
				mergeSort(left, mid);
				mergeSort(right,size-mid);
				
				merge(arr,left,right,mid,size-mid);
			}
	
		  public static void main(String[] args) {
		        int[] elements = { 95, 56, 20, 98, 34, 77, 80 };

		        System.out.println("Given Array:");
		        displayArray(elements);

		        mergeSort(elements, elements.length);

		        System.out.println("Sorted Array:");
		        displayArray(elements);
		    }
	
	
}


