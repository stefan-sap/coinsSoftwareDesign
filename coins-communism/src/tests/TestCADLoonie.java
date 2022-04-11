package tests;

/**
* TestCADLoonie.java
*/

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coins.CADLoonie;

/**
* Junit Tests for CADLoonie.java.
*
* @author Communism
* @version 04/02/2022
*/
public class TestCADLoonie {

  private PrintStream originalOut;
  private ByteArrayOutputStream baos;
  private PrintStream newOut;
  private CADLoonie CADCoin;

  /**
  * Creates a Canadian Loonie for each test to use.
  * Does not redirect System.out as only one test uses that.
  */
  @BeforeEach
  public void beforeEach() {
    CADCoin = new CADLoonie();
  }

  /**
  * Tests the constructor.
  */
  @Test
  public void testConstructor() {
    assertNotNull(CADCoin);
  }

  /**
  * Tests the getCommonName method.
  */
  @Test
  public void testCommonName() {
    String expectedOutput = "Loonie";
    String testOutput = CADCoin.getCommonName();
    assertEquals(expectedOutput, testOutput);
  }

  /**
  * Tests the getDenomination method.
  */
  @Test
  public void testDenomination() {
    double expectedOutput = 1.00;
    double testOutput = CADCoin.getDenomination();
    assertEquals(expectedOutput, testOutput);
  }

  /**
  * Tests the getCountryCode() method.
  */
  @Test
  public void testCountryCode() {
    String expectedOutput = "CAD";
    String testOutput = CADCoin.getCountryCode();
    assertEquals(expectedOutput, testOutput);
  }

  /**
  * Tests the toString method.
  */
  @Test
  public void testToString() {
    String expectedOutput = "[CAD Loonie $1.00][%94.03 Zinc, %5.97 Magnesium]";
    redirectOutput();
    System.out.print(CADCoin);
    checkOutput(expectedOutput);
    resetOutput();
  }
  /**
  * Tests the smeltingSpecs method.
  */
  @Test
  public void testSmeltingSpecs()
  {
    double [] expectedOutput = {0, 94.03, 5.97, 0};
    double [] testOutput = CADCoin.getSmeltingSpecs();
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
