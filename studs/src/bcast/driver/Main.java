package bcast.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import BCA6.student;

public class Main {

			public static void main(String[] args)throws ClassNotFoundException,SQLException {
				// TODO Auto-generated method stub


		Class.forName("com.mysql.cj.jdbc.Driver");



		String url = "jdbc:mysql://localhost:3306/ank";



		String db= "root";


		String psd = "nity";

		Connection con = DriverManager.getConnection(url,db,psd);



		Scanner sc = new Scanner(System.in);

		student stud = new student();

		boolean exit = false;

		while (!exit) {
			System.out.println("Choose an operation:");
			System.out.println("1. Insert Student");
			System.out.println("2. Display Students");
			System.out.println("3. Update Student");
			System.out.println("4. Remove Student");
			System.out.println("5. Exit");
			int choice = sc.nextInt();

	
		switch (choice) {
		case 1:
			stud.insertStudent(con, sc);
			break;
		case 2:
			stud.displayStudents(con, sc);
			break;
		case 3:
			stud.updateStudent(con, sc);
			break;
		case 4:
			stud.removeStudent(con, sc);
			break;
		case 5:
			
					exit = true;
					break;
				default:
					System.out.println("Invalid choice.");
					break;
				}
			}
		}}
