package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public Main() {
		
		// Exception Handling
		
//		try {
//			System.out.println(4 / 0);
//		} catch (ArithmeticException e) {
//			System.err.println("Gak bisa membagi dengan 0");
//			e.printStackTrace();
//		}
		
		// Try Catch
		
//		Scanner scan = new Scanner(System.in);
//		int choice = 0;
//		
//		do {
//			System.out.println("Menu");
//			System.out.println("====================");
//			System.out.println("1. Add");
//			System.out.println("2. Update");
//			System.out.println("3. Delete");
//			System.out.println("4. Exit");
//			System.out.print(">> ");
//			
//			try {
//				choice = scan.nextInt();
//			} catch (InputMismatchException e) {
//				System.err.println("Hanya boleh input angka!!");
//			} finally {
//				scan.nextLine();
//			}
//			
//		} while (choice != 4);
		
		// Throw
		checkAge(20);
	}
	
	public void checkAge(int age) {
		if (age < 18) {
			throw new InputMismatchException("Access Denied - Must be at least 18 years old");
		} else {
			System.out.println("Access Granted");
		}
	}

	public static void main(String[] args) {
		new Main();
	}

}
