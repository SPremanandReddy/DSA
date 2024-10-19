package dsaHashMap;


import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
class Student {
	
    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
		 Double max = Double.MIN_VALUE;
        Double min = Double.MAX_VALUE;
        
        // List to store the names of all top and low scorers
        List<String> maxNames = new ArrayList<>();
        List<String> minNames = new ArrayList<>();
        
        // First loop to find max and min scores
        for (Double score : studentMarks.values()) {
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }
        
        // Second loop to find all students who have max or min score
        for (String key : studentMarks.keySet()) {
            Double val = studentMarks.get(key);
            if (val.equals(max)) {
                maxNames.add(key);
            }
            if (val.equals(min)) {
                minNames.add(key);
            }
        }
        
        // Create a result map to store all top and low scorers with their scores
        Map<String, Double> result = new HashMap<>();
        for (String name : maxNames) {
            result.put(name, max);
        }
        for (String name : minNames) {
            result.put(name, min);
        }

        return result;
	}

}

class HashMapTester {

	public static void main(String args[]) {
		Map<String, Double> studentMarks = new HashMap<String, Double>();
	    studentMarks.put("Lily", 90.0);
		studentMarks.put("Robin", 68.0);
		studentMarks.put("Marshall", 76.5);
		studentMarks.put("Neil", 67.0);
		studentMarks.put("Ted", 92.0);
		
		Map<String, Double> maxMinScorers = Student.findMaxMinScorers(studentMarks);
		
		System.out.println("Details of Top Scorers & Low Scorers\n====================================");
		for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}
}