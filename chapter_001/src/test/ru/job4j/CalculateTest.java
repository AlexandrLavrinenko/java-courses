package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
* @author alavrinenko (mailto:alexandr.lavrinenko@gmail.com).
* @version $Id$.
* @since 0.1.
*/

public class CalculateTest {
	/**
	* Test echo.
	*/ 
	@Test
	public void whenTakeNameThenTreeEchoPlusName() {
    String input   = "General-Admiral Aladeen";
    String expect  = "Echo, echo, echo : General-Admiral Aladeen"; 
    Calculate calc = new Calculate();
    String result  = calc.echo(input);
    assertThat(result, is(expect));
}
	/**
	* Test2 echo.
	*/ 	
	@Test
	public void whenSetNullInEchoThenReturnTwoSpasesPlusName() {
		//assigne
		Calculate calc = new Calculate();
		String result  = calc.echo(null);
		
		assertThat(result, is("Echo, echo, echo : null"));
	}
}
