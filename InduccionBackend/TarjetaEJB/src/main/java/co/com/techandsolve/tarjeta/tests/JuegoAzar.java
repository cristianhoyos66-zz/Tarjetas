package co.com.techandsolve.tarjeta.tests;

import java.util.Random;

public class JuegoAzar {

	private Dice dice;
	
	public JuegoAzar(Dice dice) {
		this.dice = dice;
	}

	public String throwingDice() {
		if (dice.throwDice() == 5) {
			return "Winner";
		}
		return "Loser";
	}

}
