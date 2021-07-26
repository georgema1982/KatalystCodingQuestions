package katalyst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PrintNumberTest {

  private PrintNumber printNumber;

  @Before
  public void setUp() {
    printNumber = new PrintNumber();
  }

  @Test
  public void shouldConvertNumberToFooBarIfNumberIsMultipleofThreeAndFive() {
    Arrays.asList(15, 30).forEach(number -> assertEquals("FooBar", printNumber.convert(number)));
  }

  @Test
  public void shouldConvertNumberToFooIfNumberIsMultipleofThree() {
    Arrays.asList(3, 6, 9).forEach(number -> assertEquals("Foo", printNumber.convert(number)));
  }

  @Test
  public void shouldConvertNumberToBarIfNumberIsMultipleofFive() {
    Arrays.asList(5, 10).forEach(number -> assertEquals("Bar", printNumber.convert(number)));
  }

  @Test
  public void shouldConvertNumberAsIsForOtherNumbers() {
    Arrays.asList(1, 2, 4).forEach(number -> assertEquals(String.valueOf(number), printNumber.convert(number)));
  }

  @Test
  public void shouldConvertAll() {
    List<String> strings = printNumber.convertAll();
    assertEquals(100, strings.size());
    assertEquals("1", strings.get(0));
    assertEquals("Foo", strings.get(2));
    assertEquals("Bar", strings.get(4));
    assertEquals("FooBar", strings.get(14));
  }
}
