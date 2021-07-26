package katalyst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TopIntegersTest {

  private TopIntegers topIntegers;

  final private int[] array = {2, 12, 1, 9, 6};

  @Before
  public void setUp() {
    topIntegers = new TopIntegers();
  }

  @Test
  public void shouldGetNullResultIfTopNumIsLessThanOne() {
    assertNull(topIntegers.top(array, 0));
  }

  @Test
  public void shouldGetNullResultIfTopNumIsGreaterThanArrayLength() {
    assertNull(topIntegers.top(array, 6));
  }

  @Test
  public void shouldGetTopOneIntegerIfTopNumIsOne() {
    int[] topElements = topIntegers.top(array, 1);
    assertEquals(1, topElements.length);
    assertEquals(12, topElements[0]);
  }

  @Test
  public void shouldGetReversedArrayIfTopNumIsArrayLength() {
    assertArrayEquals(new int[] {12, 9, 6, 2, 1}, topIntegers.top(array, array.length));
  }

  @Test
  public void shouldGetTopElementsIfTopNumIsWithinOneAndArrayLength() {
    assertArrayEquals(new int[] {12, 9, 6}, topIntegers.top(array, 3));
  }
}
