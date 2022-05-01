import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class PrimeTests {
  @ParameterizedTest(name = "{0} is prime {1}")
  @CsvFileSource(resources = "primes.csv", numLinesToSkip = 1)
  void isPrime(int number, boolean isPrime) {
    assertEquals(isPrime, ParamUtils.isPrime(number));
  }
}
