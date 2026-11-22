package project1;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите целое число: ");
      
        int number = scanner.nextInt();
        if (number == 0) {
        	System.out.println("Число не должно быть 0");
        }
        
        else if (number % 5 == 2 && number % 7 == 1 ) {
            System.out.println("Число " + number + " подходит по критериям: при делении на 5 в остатке\r\n"
            		+ "получается 2, а при делении на 7 в остатке получается 1");
        }
        
        else {
            System.out.println("Число " + number + " не подходит по критериям делении на 5 в остатке\r\n"
            		+ "получается 2, а при делении на 7 в остатке получается 1");
        }
        
        scanner.close();
	}

}
