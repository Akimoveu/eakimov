package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Test.
 * 
 *Class Calculate решение задачи части 001 урок 1
 *@author akimov
 *@since 28.11.2016
*/
public class CalculateTest {
/**
 *Test add.
*/
@Test

public void  whenAddOneToOneThenTwo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Calculate.main(null);
        assertThat(out.toString(), is("Hello World\r\n"));

	}
}