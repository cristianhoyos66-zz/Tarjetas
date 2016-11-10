package co.com.techandsolve.tarjeta.tests;

import java.util.Random;

public class Dice {

	public int throwDice() {
		return new Random().nextInt(6) + 1;
	}

}
