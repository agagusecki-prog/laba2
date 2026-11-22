package project1;

import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите целое число: ");
      
        int number = scanner.nextInt();
       
        
       if (number >= 5 && number <= 10 ) {
            System.out.println("Число " + number + " больше 5 и меньше 10 включительно");
        }
        
        else if (number <= 5){
            System.out.println("Число " + number + " меньше 5");
        }
       if (number >= 10){
           System.out.println("Число " + number + " больше 10");
       }
        
        scanner.close();
	}

}
