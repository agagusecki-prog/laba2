package project1;

import java.util.Scanner;

public class Timus1409 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		System.out.print("Введите количество банок сбитых Гарри меньше либо равно 10 ");
		int Garry = scanner.nextInt();
		if (Garry > 10 || Garry <= 0 ) {
			do{
				System.out.print("Число не корректно, банок всего 10!!! Введите заново!!! ");
			Garry = scanner.nextInt();
			} while (Garry > 10 || Garry <=0 );
		}
		
		
		int ost = 11-Garry;
		
		System.out.print("Введите количество банок сбитых Ларри, должно быть " + ost + " ");
		int Larry = scanner.nextInt();
	 
		if (Larry != ost) { 
		do {
			 System.out.print("Он не мог сбить " + Larry + " введите правильное значение ");
			Larry = scanner.nextInt(); 
		} while (Larry != ost);
		
		}
		
		System.out.println( (10 - Garry) + " " + (10 - Larry));
		
		scanner.close();
	}
	
}
