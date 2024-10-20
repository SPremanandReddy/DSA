package collectionAssignments;
import java.util.LinkedList;
import java.util.List;
import java.util.LinkedHashSet;
class LinkedListWithoutDuplicated1 {

	public static List<Integer> removeDuplicates(List<Integer> list) {
        //Implement your logic here and change the return statement accordingly
        List<Integer> output = new LinkedList<Integer>();
        for(int i=0; i<list.size(); i++){
            if(output.contains(list.get(i))) continue;
            output.add(list.get(i));
        }
        return output;
	}
	
	public static void main(String args[]) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(15);
		list.add(21);
		list.add(15);
		list.add(10);
		
		List<Integer> updatedList = removeDuplicates(list);
		
		System.out.println("Linked list without duplicates");
		for (Integer value : updatedList) {
			System.out.print(value+" ");
		}
	}
	
}