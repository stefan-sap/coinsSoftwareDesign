package tests;

/**
 * TestCoin.java
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import coins.Mint;
import coins.Coin;
import coins.USDMint;

/**
 * Junit tests for Cookie.java.
 *
 * @author comrads
 * @version 03/30/2022
 */
public class TestUSDMint {

    Mint mint;

    /**
     * Creates a mock coin for each test to use.
     */
    @BeforeEach
    public void beforeEach() {
        this.mint = USDMint.getInstance();
    }

    /**
     * Tests the singleton constructor.
     */
    @Test
    public void testGetInstance() {
        Mint newMint = USDMint.getInstance();
	    assertEquals(this.mint, newMint);
	}

    /**
     * Test the manufacture method.
     */
    @Test
    public void testManufacture() {
        Coin c = this.mint.manufacture("Dollar");
        assertEquals(c.toString(), "[USD Dollar $1.00][%88.5 Copper, %6.0 Zinc, %3.5 Magnesium, %2.0 Nickle]");
    }

}
