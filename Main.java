 
 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student ID: ");
        int studentID = scanner.nextInt();
        System.out.print("Enter student age: ");
        int studentAge = scanner.nextInt();
        System.out.print("Enter student fee: ");
        float studentFee = scanner.nextFloat();
        System.out.print("Enter student grade: ");
        char studentGrade = scanner.next().charAt(0);
        System.out.println("\nStudent Details:");
        System.out.println("Student name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);
        scanner.close();
    }
}