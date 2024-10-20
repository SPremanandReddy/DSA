package collectionAssignments;



import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class occurrencesbyHashMap {
    public static Map<Character, Integer> findOccurrences(String input) {
        // Implement your logic here and change the return statement accordingly
        Map<Character, Integer> occurrences = new HashMap<Character, Integer>();
        for (Character ch : input.toCharArray()) {
            if (ch == ' ') { // Skip spaces
                continue;
            }
            if (!occurrences.containsKey(ch)) {
                occurrences.put(ch, 1);
            } else {
                occurrences.put(ch, occurrences.get(ch) + 1);
            }
        }
        return occurrences;
    }

    public static void main(String args[]) {
        String input = "hello world! welcome to java";
        Map<Character, Integer> occurrenceMap = findOccurrences(input);

        System.out.println("Occurrences of characters\n=======================");
        for (Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }
}
