package by.academy.homework1;

public class Application {
	public static void main(String[] args) {
		Cat cat1 = new Cat("Финдус");
		cat1.eat();
		cat1.sleep();
		cat1.walk();
		cat1.setMoney(25);
		cat1.setIsHomeAnimal(true);
		System.out.println("Этот бездельник обошёлся мне в " + cat1.getMoney() + " рублей.");
		System.out.println("У него на ухе тату с буквой " + "\"" + cat1.getInitials() + "\".");
		
		Cat cat2 = new Cat();
		cat2.grow();
		cat2.grow();
		cat2.grow();
		cat2.setMoney(3);
		cat2.setIsHomeAnimal(false);
		System.out.println("Второму коту " + cat2.age + " лет, я купила его за " + cat2.getMoney() + " рубля.");
	
		boolean getisHomeAnimal;
		if(getisHomeAnimal = true) {
			System.out.println("Финдус живёт в квартире.");	
		} if(getisHomeAnimal = true) {
			System.out.println("Второй кот шастает по соседским клумбам.");
		}
			
		

	}

}

