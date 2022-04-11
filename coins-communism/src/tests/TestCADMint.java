package tests;

/**
* TestCADDime.java
*/

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import coins.Mint;
import coins.Coin;
import coins.CADMint;

/**
* Junit Tests for CADMint.java.
*
* @author Communism
* @version 04/03/2022
*/
public class TestCADMint {

  private PrintStream originalOut;
  private ByteArrayOutputStream baos;
  private PrintStream newOut;
  private Mint mint;

  /**
  * Creates a Canadian Dime for each test to use.
  * Does not redirect System.out as only one test uses that.
  */
  @BeforeEach
  public void beforeEach() {
    this.mint = CADMint.getInstance();
  }

  /**
  * Tests the getInstance method.
  */
  @Test
  public void testgetInstance() {
    Mint newCADMint = CADMint.getInstance();
    assertEquals(mint, newCADMint);
  }

  /**
  * Tests the manufacture method.
  */
  @Test
  public void testManufacture() {
    Coin c = this.mint.manufacture("CADLoonie");
    assertEquals("[CAD Loonie $1.00][%94.03 Zinc, %5.97 Magnesium]", c.toString());
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


