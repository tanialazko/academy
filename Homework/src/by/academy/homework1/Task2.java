package by.academy.homework1;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("¬ведите тип данных:");
		String type = x.nextLine();
		System.out.println("¬ведите переменную:");
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		Scanner d = new Scanner(System.in);
		Scanner e = new Scanner(System.in);
				
		switch(type) {
		case "int":
			int number1 = a.nextInt();
			System.out.println(number1%2);
			break;
		case "double":
			double number2 = b.nextDouble();
			System.out.println(number2*0.7);
			break;
		case "float":
			float number3 = c.nextFloat();
			System.out.println(number3*number3);
			break;
		case "char":
			char operator;
			char number4 = (char) d.nextInt();
			System.out.println(number4);
			break;	
		case "String":
			String name = e.nextLine();
			System.out.println("Hello, "+name);
			break;
		default:
			System.out.println("Unsupported type");
			}
			} 
	
}