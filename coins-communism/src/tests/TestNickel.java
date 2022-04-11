package tests;

/**
* TestNickel.java
*/

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coins.Nickel;

/**
* Junit Tests for Nickel.java.
*
* @author Communism
* @version 04/02/2022
*/
public class TestNickel {

  private PrintStream originalOut;
  private ByteArrayOutputStream baos;
  private PrintStream newOut;
  private Nickel USDCoin;

  /**
  * Creates a Nickel USDCoin for each test to use.
  * Does not redirect System.out as only one test uses that.
  */
  @BeforeEach
  public void beforeEach() {
    USDCoin = new Nickel();
  }

  /**
  * Tests the constructor.
  */
  @Test
  public void testConstructor() {
    assertNotNull(USDCoin);
  }

  /**
  * Tests the getCommonName method.
  */
  @Test
  public void testCommonName() {
    String expectedOutput = "Nickle";
    String testOutput = USDCoin.getCommonName();
    assertEquals(expectedOutput, testOutput);
  }

  /**
  * Tests the getDenomination method.
  */
  @Test
  public void testDenomination() {
    double expectedOutput = 0.05;
    double testOutput = USDCoin.getDenomination();
    assertEquals(expectedOutput, testOutput);
  }

  /**
  * Tests the getCountryCode() method.
  */
  @Test
  public void testCountryCode() {
    String expectedOutput = "USD";
    String testOutput = USDCoin.getCountryCode();
    assertEquals(expectedOutput, testOutput);
  }

  /**
  * Tests the toString method.
  */
  @Test
  public void testToString() {
    String expectedOutput = "[USD Nickle $0.05][%75.0 Copper, %25.0 Nickle]";
    redirectOutput();
    System.out.print(USDCoin);
    checkOutput(expectedOutput);
    resetOutput();
  }
  /**
  * Tests the smeltingSpecs method.
  */
  @Test
  public void testSmeltingSpecs()
  {
    double [] expectedOutput = {75, 0, 0, 25};
    double [] testOutput = USDCoin.getSmeltingSpecs();
    for (int i = 0; i < expectedOutput.length; i++){
      assertEquals(expectedOutput[i], testOutput[i]);
    }

  }

  /* Helper functions */

  /**
  * Redirects System.out to go into baos.
  */
  private void redirectOutput() {
    originalOut = System.out;
    baos = new ByteArrayOutputStream();
    newOut = new PrintStream(baos);
    System.setOut(newOut);
  }

  /**
  * Resets System.out to the value in originalOut.
  */
  private void resetOutput() {
    if (originalOut != null) {
      System.setOut(originalOut);
    }
  }

  /**
  * Checks if a given value matches that in baos.
  *
  * @param expected - the value expected to be in baos
  */
  private void checkOutput(String expected) {
    System.out.flush();
    String actual = baos.toString();
    assertEquals(expected, actual);
  }
}
