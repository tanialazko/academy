package by.academy.homework1;

public class Application {
	public static void main(String[] args) {
		Cat cat1 = new Cat("������");
		cat1.eat();
		cat1.sleep();
		cat1.walk();
		cat1.setMoney(25);
		cat1.setIsHomeAnimal(true);
		System.out.println("���� ���������� �������� ��� � " + cat1.getMoney() + " ������.");
		System.out.println("� ���� �� ��� ���� � ������ " + "\"" + cat1.getInitials() + "\".");
		
		Cat cat2 = new Cat();
		cat2.grow();
		cat2.grow();
		cat2.grow();
		cat2.setMoney(3);
		cat2.setIsHomeAnimal(false);
		System.out.println("������� ���� " + cat2.age + " ���, � ������ ��� �� " + cat2.getMoney() + " �����.");
	
		boolean getisHomeAnimal;
		if(getisHomeAnimal = true) {
			System.out.println("������ ���� � ��������.");	
		} if(getisHomeAnimal = true) {
			System.out.println("������ ��� ������� �� ��������� �������.");
		}
			
		

	}

}

