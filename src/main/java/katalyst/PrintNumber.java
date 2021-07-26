package katalyst;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintNumber {

  final private List<Pair<Integer, String>> conversionMap = Arrays.asList(new Pair<>(15, "FooBar"), new Pair<>(3, "Foo"), new Pair<>(5, "Bar"));

  public String convert(int number) {
    return conversionMap.stream().filter(pair -> number % pair.getKey() == 0).findFirst().map(Pair::getValue).orElse(String.valueOf(number));
  }

  public List<String> convertAll() {
    return IntStream.range(1, 101).mapToObj(this::convert).collect(Collectors.toList());
  }

  public static void main(String[] args) {
    new PrintNumber().convertAll().forEach(number -> System.out.println(number));
  }
}
