package katalyst;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Anagram {

  public boolean isAnagram(String string1, String string2) {
    if (string1.length() != string2.length()) {
      return false;
    }
    final String sortedString1 = sort(string1);
    final String sortedString2 = sort(string2);
    return IntStream.range(0, string1.length()).anyMatch(index -> sortedString1.charAt(index) != sortedString2.charAt(index)) ? false : true;
  }

  private String sort(String string) {
    char[] chars = string.toUpperCase().toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }
}
