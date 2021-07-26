package katalyst;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class TopIntegers {

  public int[] top(int[] array, int topNum) {
    if (topNum < 1 || topNum > array.length) {
      return null;
    }
    Arrays.sort(array);
    ArrayUtils.reverse(array);
    return Arrays.copyOfRange(array, 0, topNum);
  }
}
