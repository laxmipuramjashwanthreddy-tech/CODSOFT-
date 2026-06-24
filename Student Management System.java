import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
	
	public static void main(String[] args) {
		
		ArrayList<String> students = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
			System.out.println("1. Add Student");
			System.out.println("2. View Students");
			System.out.println("3. Remove Student");
			System.out.println("4. Exit");
			System.out.print("Enter Choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
				
				case 1:
				     System.out.print("Enter Student Name: ");
				     String name = sc.nextLine();
				     students.add(name);
				     System.out.println("Student Added Successfully!");
				     break;
				     
				case 2:
				     System.out.println("\nStudent List:");
				     if (students.is Empty()) {
				     	System.out.println("No students Found.");
				     } else {
				     	for (String student : students) {
				     		System.out.println(student);
				     	}
				     }
				     break;
				     
				case 3:
				     System.out.print("Enter Student Name to Remove: ");
				     String removeName = sc.nextLine();
				     if(students.remove(removeName)) {
				     	System.out.println("Student Removed Successfully!");
				     } else {
				     	System.out.println("Student Not Found!");
				     }
				     break;
				     
				case 4:
				     System.out.println("Exiting...");
				     System.exit(0);
				     
				     default:
				           System.out.println("Invalid Choice!");
			}
		}
	}
}