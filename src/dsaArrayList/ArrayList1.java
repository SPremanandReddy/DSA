package dsaArrayList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class ArrayList1 {

	public static void main(String[] args) {
		List al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("C");
		if(al.isEmpty()) {
			System.out.println("It is empty");
		}
		
		System.out.println("size "+al.size());
		System.out.println(al);
		List<String> al2 = new ArrayList<String>();
		al2.add("D");
		al2.add("F");
		al.addAll(al2);
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.remove("C"));
		System.out.println(al);
		
		System.out.println(al.contains("F"));
		System.out.println(al.containsAll(al2));
		al.removeAll(al2);
		System.out.println(al.containsAll(al2));
		
//		converting a list to array
		Object[] arr = al.toArray();
		al.clear();
		System.out.println(arr.length);
		for(Object val:arr) {
			System.out.println((String)val);
		}
		
		
//		iterating the arraylist;
		
		
		List<Student> al3=new ArrayList<Student>();
		al3.add(new Student(1,"prem",34));
		al3.add(new Student(2,"orem",38));
		al3.add(new Student(3,"erem",37));
		al3.add(new Student(4,"arem",301));
		al3.add(new Student(10,"hrem",39));
		
		List<String> al4 = new ArrayList<String>();
		for(Student student:al3) {
			al4.add(student.getName());
			System.out.println("Id :"+student.getId());
			System.out.println("Name : "+student.getName());
			System.out.println("REg No: "+student.getRegNo());
		}
		System.out.println(al4);
		
//		by iterator , it can be used for all collection classes mostly for legacy classes
		Iterator<String> iterator = al4.iterator();
		while(iterator.hasNext()) {
			System.out.println( iterator.next());
////			iterator.remove();
			}
		System.out.println(al4);
		
		
//		for list, we have listIterator
		ListIterator<String> iterator1 = al4.listIterator(al4.size());
		while(iterator1.hasPrevious()) { //we can use hasNext also
			System.out.println( iterator1.previous());
		}
	}
}
