package dsaHashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student {

	private int studentId;
	private String studentName;
	private int courseId;

	public Student(int studentId, String studentName, int courseId) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseId = courseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public boolean equals(Object student) {
		Student otherStudent = (Student) student;
		if (this.studentId == otherStudent.studentId)
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return studentId;
	}

	@Override
	public String toString() {
		return "Student Id: "+studentId + ", Student Name: " + studentName;
	}

}


class HashSetTester {

	public static Set<Student> findDuplicateEntries(List<Student> students) {
		//Implement your logic here and change the return statement accordingly 
	Set<Student> seen = new HashSet<>();          // To track seen students
        Set<Student> duplicates = new HashSet<>();    // To store duplicate students
        
//        Here, in set, add methods, checks whether the element is there or not, if it is already there.
//        It return false and not be added. if it is not there, it will be added and return true;
        
        for (Student student : students) {
        	System.out.println(seen.add(student));
            if (!seen.add(student)) {  // If the student is already seen, it's a duplicate
                System.out.println(seen);
            	duplicates.add(student);
            }
        }
        return duplicates;
	}
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student(1001, "Dean", 111));
		students.add(new Student(1002, "Harley", 112));
		students.add(new Student(1003, "Franklin", 113));
		students.add(new Student(1005, "Arden", 113));
		students.add(new Student(1100, "Juliet", 112));
		students.add(new Student(1003, "Franklin", 111));
		students.add(new Student(1001, "Dean", 114));
        System.out.println(students);
		Set<Student> duplicateStudents = findDuplicateEntries(students);
		System.out.println("Students who have applied for re-evaluation in more than one subject");
		for(Student student: duplicateStudents)
		    System.out.println(student);
	}
}
