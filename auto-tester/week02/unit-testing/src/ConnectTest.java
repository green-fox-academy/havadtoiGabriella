import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConnectTest {

  @Test
  void concatMethodConnectTwoStringsCorrectly() {
    String first = "sun";
    String second = "set";
    assertEquals("sunset", Connect.concatStrings(first, second));
  }

  @Test
  void concatMethodConnectTwoStringsWithSpacesCorrectly() {
    String first = "sun ";
    String second = " set";
    assertEquals("sunset", Connect.concatStrings(first, second));
  }

  @Test
  void concatMethodNotConnectTwoStringsCorrectly() {
    String first = "sun";
    String second = "set";
    assertNotEquals("sun set", Connect.concatStrings(first, second));
  }

  @Test
  void concatMethodNotConnectTwoUpperCaseStringsCorrectly() {
    String first = "SUN";
    String second = "SET";
    assertNotEquals("sunset", Connect.concatStrings(first, second));
  }

}