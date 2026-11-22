package project1;

import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите целое число: ");
      
        int number = scanner.nextInt();
       int natur = Math.abs(number);
        int rezult = natur/1000;
        
     if (number > 1000 || number < -1000) {
    	 System.out.println("В числе " + number + ", " + rezult + " тысяч");
     }
     else if (number < 1000 && number > -1000) {
    	 System.out.println("В числе " + number + " нет тысяч");
     }
        
        scanner.close();
	}

}