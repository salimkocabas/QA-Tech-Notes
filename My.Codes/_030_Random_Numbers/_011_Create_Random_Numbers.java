package _030_Random_Numbers;

import java.util.Random;

public class _011_Create_Random_Numbers {
	public static void main(String[] args) {

		Random random = new Random();

		for (int i = 0; i < 5; i++) {
			double randomDouble = Math.random();
			System.out.println("Random Double Number in Java: " + randomDouble);
		}

		for (int i = 0; i < 5; i++) {
			int randomInteger = random.nextInt(100);
			System.out.println("Random Int  Number in Java  : " +randomInteger);
		}

	}
}