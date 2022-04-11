package tests;

/**
* Test Penny.java
*/

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coins.Penny;

/**
* Junit Tests for Penny.java.
*
* @author Communism
* @version 04/02/2022
*/
public class TestPenny {

  private PrintStream originalOut;
  private ByteArrayOutputStream baos;
  private PrintStream newOut;
  private Penny USDCoin;

  /**
  * Creates a Penny USDCoin for each test to use.
  * Does not redirect System.out as only one test uses that.
  */
  @BeforeEach
  public void beforeEach() {
    USDCoin = new Penny();
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
    String expectedOutput = "Penny";
    String testOutput = USDCoin.getCommonName();
    assertEquals(expectedOutput, testOutput);
  }
 
  /**
  * Tests the getDenomination method.
  */
  @Test
  public void testDenomination() {
    double expectedOutput = 0.01;
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
    String expectedOutput = "[USD Penny $0.01][%2.5 Copper, %97.5 Zinc]";
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
    double [] expectedOutput = {2.5, 97.5, 0, 0};
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


