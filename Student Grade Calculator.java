import java.util.Scanner;

public class StudentGradeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Number of Subjects: ");
		int n = sc.nextInt();
		
		int total = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Marks of Subject " + i + ": ");
			total += sc.nextInt();
		}
		
		double percentage = (double) total / n;
		String grade;
		
		if (percentage >= 90)
		   grade = "A";
		else if (percentage >= 75)
		   grade = "B";
		else if (percentage >= 60)
		   grade = "C";
		else if (percentage >= 40)
		   grade = "D";
		else 
		   grade = "F";
		   
		String result = (percentage >= 40) ? "PASS" : "FAIL";
		
		System.out.println("\n----- RESULT -----");
		System.out.println("Name : " + name);
		System.out.println("Total Marks: " + total);
		System.out.println("Percentage : " + percentage + "%");
		System.out.println("Grade : " + grade);
		System.out.println("Status : " + result);
		
		sc.close();
	}
}