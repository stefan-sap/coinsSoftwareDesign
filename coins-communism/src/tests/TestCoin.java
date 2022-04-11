package tests;

/**
 * TestCoin.java
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import coins.Coin;

/**
 * Junit tests for Cookie.java.
 *
 * @author comrads
 * @version 03/30/2022
 */
public class TestCoin {

    Coin coin;

    /**
     * Creates a mock coin for each test to use.
     */
    @BeforeEach
    public void beforeEach() {
        coin = new MockCoin();
    }

    /**
     * Tests the constructor.
     */
    @Test
    public void testConstructor() {
	    assertNotNull(coin);
	}

    /**
     * Tests the getDescription() method.
     */
    @Test
    public void testDescription() {
	    String expectedOutput = MockCoin.DESCRIPTION;
	    String testOutput = coin.getCommonName();
        assertEquals(expectedOutput, testOutput);
    }
}
