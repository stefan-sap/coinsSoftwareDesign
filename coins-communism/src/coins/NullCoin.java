package coins;

/**
 * NullCoin.java
 */

/**
 * NullCoin is a realization of the coins abstraction.
 *
 * @author Katherine Beal
 * @version 04/02/2022
 */

public class NullCoin extends USDCoin {
    /**
     * No-arg constructor.
     * Sets all the fields appropriately.
     */
    public NullCoin()
    {
        super("Null", 0, new NullSmelt());
    }
}
