package by.academy.homework1;

public class Cat {
	int age = 10;
	String nickname = "Финдус";
	int money;
	char initials = nickname.charAt(0);
	boolean isHomeAnimal;
		
	public void grow() {
		age = age + 1;			
	}
	public void sleep() {
		System.out.println("Кот " + nickname + " спит.");
	}
	public void eat() {
		System.out.println("Кот " + nickname + " ест.");
	}
	public void walk() {
		System.out.println("Кот " + nickname + " гуляет.");
	}
	public Cat() {		
	}
	public Cat(String nickname) {
		this.nickname = nickname;
	}
	public void setMoney(int i) {
		money = i;
	}
	public int getMoney() {
		return money;
	}
	public void setInitials(char i) {
		initials = i;
	}
	public char getInitials() {
		return initials;
	}
	public void setIsHomeAnimal(boolean k) {
		isHomeAnimal = k;		
	}
	public boolean getIsHomeAnimal() {
		return isHomeAnimal;
	}
}

