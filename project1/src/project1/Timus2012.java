package project1;

import java.util.Scanner;

public class Timus2012 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Введите количество задач которые Гриша должен решить за первый час до 11: ");
	        int zadach = scanner.nextInt();
	        if (zadach < 0 && zadach > 11) {
	        do {
	        System.out.println("Число меньше 0 или больше 11, введите количество задач по новой");
	         zadach = scanner.nextInt();
	        } while (zadach < 0 && zadach > 11);
	        }
	        if (zadach >= 7) { 
	        	System.out.println("YES");
	        }
	        else {
	        	 System.out.println("NO");
	        }     
	        scanner.close();
	}
	

}
