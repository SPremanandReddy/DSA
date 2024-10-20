package collectionAssignments;

import java.util.LinkedList;
import java.util.List;

class CombineTwoLinkedListAndSort {
    
	public static List<Integer> mergeLists(List<Integer> listOne, List<Integer> listTwo) {
		 //Implement your logic here and change the return statement accordingly
		 List<Integer> result = new LinkedList<Integer>();
		 result.addAll(listOne);
		 result.addAll(listTwo);
		 
		 for(int i=0; i<result.size()-1; i++){
		     boolean isSwapped=false;
		     for(int j=0; j<result.size()-1-i; j++){
		         if(result.get(j)>result.get(j+1)){
		             Integer temp=result.get(j);
		             result.set(j,result.get(j+1));
		             result.set(j+1, temp);
		             isSwapped=true;
		         }
		     }
		     if(!isSwapped){
		         break;
		     }
		 }
		 
         return result;
	}

	public static void main(String args[]) {
		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(10);
		listOne.add(13);
		listOne.add(21);
		listOne.add(42);
		listOne.add(56);
		
		List<Integer> listTwo = new LinkedList<Integer>();
		listTwo.add(15);
		listTwo.add(20);
		listTwo.add(21);
		listTwo.add(85);
		listTwo.add(92);
		
		List<Integer> mergedList = mergeLists(listOne, listTwo);
		System.out.println(mergedList);
	}
}