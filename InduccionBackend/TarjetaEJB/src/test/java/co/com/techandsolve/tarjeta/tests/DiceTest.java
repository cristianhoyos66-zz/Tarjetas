package co.com.techandsolve.tarjeta.tests;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class DiceTest {

	@Test
	public void shouldReturnNumberBetween1And6() {
		//Arrange
		Dice dice = new Dice();
		//Act
		int result = dice.throwDice();
		//Assert
		assertThat(result).isGreaterThan(0);
		assertThat(result).isLessThan(7);
	}
	
}
