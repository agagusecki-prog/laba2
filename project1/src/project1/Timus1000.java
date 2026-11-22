package project1;

import java.util.Scanner;

public class Timus1000 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		System.out.print("Введите первое число ");
		int x = scanner.nextInt();
		System.out.print("Введите второе число ");
		int y = scanner.nextInt();
		
		System.out.print(x + " + " + y + " = " + (x+y));
		
		scanner.close();
	}

}
