package dsaSearching;
class BinarySearchIterations {
    
    public static int iterations=0;
	
	public static int searchElement(int elements[],int low,int high,int elementToBeSearched)  {
		//Implement your logic here and change the return statement accordingly
		
		if(low<=high){
		    int mid = (low+high)/2;
		    iterations++;
		    if(elements[mid]==elementToBeSearched){
		        return mid;
		    }else if(elements[mid]<elementToBeSearched){
		        return searchElement(elements, mid+1, high, elementToBeSearched);
		    }else{
		        return searchElement(elements, low , mid-1, elementToBeSearched);
		    }
		}
		return -1;
	}
	
	public static void main(String[] args) {
	    int[] elements = { 1, 23, 43, 46, 78, 90 };
		int elementToBeSearched = 43;
		
		int indexPosition=searchElement(elements, 0, elements.length-1, elementToBeSearched);
		
		if (indexPosition == -1)
			System.out.println("Element not found!");
		else
			System.out.println("Element found at index position " + indexPosition+"!");
		
		System.out.println("Number of iterations: "+iterations);
	}

	
}