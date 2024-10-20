package collectionAssignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class HashMapByValuesArrangeInAsc {
    
	public static List<String> sortSales(Map<String, Integer> sales) {
		//Implement your logic here and change the return statement accordingly
		List<Entry<String, Integer>> salesList = new ArrayList<>(sales.entrySet());
		Collections.sort(salesList, new Comparator<Entry<String,Integer>>() {
			public int compare(Entry<String, Integer> entry1, Entry<String, Integer> entry2) {
//				return entry1.getValue().compareTo(entry2.getValue()); for increasing order
				return entry2.getValue().compareTo(entry1.getValue()); //for decreasingOrder
			}
		});
		
		
		List<String> result = new ArrayList<>();
		for(Entry<String,Integer> data:salesList) {
			result.add(data.getKey());
		}
		
		return result;
	}

	public static void main(String args[]) {
	    Map<String, Integer> sales = new HashMap<String, Integer>();
		sales.put("Mathew", 50);
		sales.put("Lisa", 76);
		sales.put("Courtney", 45);
		sales.put("David", 49);
		sales.put("Paul", 49);
		
		List<String> employees = sortSales(sales);
		
		System.out.println("Employees in the decreasing order of their sales\n=====================================");
		for (String employeeName : employees) {
			System.out.println(employeeName);
		}
	}

}