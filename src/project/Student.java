package project;
import java.util.*;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses=null;
	private int balanceDue;
	private static int courseCost=600;
	private static int id=1000;
	
	Scanner sc=new Scanner(System.in);
	public Student()
	{
		System.out.println("Enter student first name: ");
		this.firstName=sc.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName=sc.nextLine();
		
		System.out.println("Enter student year: ");
		this.gradeYear=sc.nextInt();
		
		setStudentId();
	}
	
	//generating Id
	private void setStudentId()
	{
		//grade level+id
		id++;
		this.studentId=gradeYear+""+id;
	}
	
	//enroll in courses
	public void enroll()
	{
		System.out.println("List of Courses available: \n 1.Data Science\n 2.Machine Learning\n 3.Artificial Intelligence\n 4.Deep Learning\n 5.DBMS");
		
		do
		{
			System.out.print("Enter course to enroll and Q to quit: ");
			Scanner sc=new Scanner(System.in);
			String course=sc.nextLine();
			if(!course.equals("Q"))
			{
				courses=courses+"\n  "+course;
				balanceDue+=courseCost;
			}
			else
			{
				break;
			}
		}while(1!=0);
	}
	
	//view balance
	public void viewBalance()
	{
		System.out.println("Your balance is: "+balanceDue );
		
	}
	
	//pay due
	public void payFee()
	{
		viewBalance();
		System.out.print("Enter your payment: ");
		int payment=sc.nextInt();
		balanceDue-=payment;
		System.out.println("Thank you for your payment of rupees "+payment);
		viewBalance();
	}
	
	//show status
	public String showInfo()
	{
		return "Name: "+firstName+" "+lastName+"\nYear: "+gradeYear+"\nStudent ID: "+studentId +"\nCourses Enrolled: "+courses +"\nBalance: "+balanceDue;
	}
}
