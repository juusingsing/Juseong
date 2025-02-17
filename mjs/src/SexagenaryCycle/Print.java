package SexagenaryCycle;

public class Print {

	public static void main(String[] args) {
		Mouse mouse = new Mouse("자", 1, 0.01, true, 2);
		Cow cow = new Cow("축", 2, 0.01, false, 700);
		Tiger tiger = new Tiger("인", 3, 0.089, false, true);
		Rabbit rabbit = new Rabbit("묘", 4, 0.0007, false, 8);
		Dragon dragon = new Dragon("진", 5, 0, true, true);
		Snake snake = new Snake("사", 6, 0.035, false, true);
		Horse horse = new Horse("오", 7, 0.01, false, 45);
		Sheep sheep = new Sheep("미", 8, 0.009, false, true);
		
		sheep.printSexagenaryCycle(
			horse.printSexagenaryCycle(
				snake.printSexagenaryCycle(
					dragon.printSexagenaryCycle(
						rabbit.printSexagenaryCycle(
							tiger.printSexagenaryCycle(
								cow.printSexagenaryCycle(
									mouse.getSexagenaryCycle())))))));
		
		sheep.printOrder(
			horse.printOrder(
				snake.printOrder(
					dragon.printOrder(
						rabbit.printOrder(
							tiger.printOrder(
								cow.printOrder(
									mouse.getOrder())))))));
	}

}
