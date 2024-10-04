package project;
import java.util.*;

public class Student_Management_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how many students to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner sc=new Scanner(System.in);
		int numOfStudents=sc.nextInt();
		Student[] students=new Student[numOfStudents];
		//create n number of students
		for(int i=0;i<numOfStudents;i++)
		{
			students[i]=new Student();
			students[i].enroll();
			students[i].payFee();
		}
		
		for(int i=0;i<numOfStudents;i++)
		{
			System.out.println(students[i].showInfo());
		}
	}

}
