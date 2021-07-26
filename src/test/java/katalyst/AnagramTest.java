package katalyst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnagramTest {

  private Anagram anagram;

  @Before
  public void setUp() {
    anagram = new Anagram();
  }

  @Test
  public void shouldReturnFalseIfTwoStringsAreOfDifferentLengths() {
    assertFalse(anagram.isAnagram("ANT", "TANGENT"));
  }

  @Test
  public void shouldReturnTrueIfTwoStringsAreAnagrams() {
    assertTrue(anagram.isAnagram("ANGEL", "GLEAN"));
  }

  @Test
  public void shouldReturnTrueIfTwoStringsWithDuplicatedCharactersAreAnagrams() {
    assertTrue(anagram.isAnagram("ABBA", "BABA"));
  }

  @Test
  public void shouldReturnFalseIfTwoStringsAreNonAnagrams() {
    assertFalse(anagram.isAnagram("MUMMY", "YUMMY"));
  }

  @Test
  public void shouldBeNonAnagramsIfTwoStringsOnlyDifferAtTheLastCharacter() {
    assertFalse(anagram.isAnagram("ANT", "ANY"));
  }

  @Test
  public void shouldIgnoreCasesWhenCheckingAgrams() {
    assertTrue(anagram.isAnagram("ANT", "ant"));
  }
}
