package by.academy.homework1;
import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Введите число:");
		int number = x.nextInt();
		System.out.println("Фрагмент таблицы умножения:");
		for(int a = 1; a<=10; a++ ) {
			System.out.println(number+" x "+a+" = "+(number*a));
			
		}
	}

}
