package coins;

import java.util.Random;

/**
 * Abstract singleton mint class.
 * @version 2022-03-28
 */
public abstract class Mint {
    /**
     * Empty getInstance() method.
     *
     * @return Mint instance
     */
    public static Mint getInstance() {
        return null;
    }

    /**
     * Performs the steps to create a new coin.
     *
     * @param denomination The coin denomination
     * @return The new coin
     */
    public Coin makeCoin(String denomination) {
        Coin c = manufacture(denomination);
        c = inspection(c);
        c = smoothing(c);
        c = buffing(c);
        return c;
    }

    /**
     * The manufacture method that will invoke coin smelting. 
     *
     * @param denomination The coin denomination
     * @return The new coin
     */
    public abstract Coin manufacture(String denomination);

    /**
     * Inspect the coin.
     *
     * @param the coin
     * @return the coin
     */
    public Coin inspection(Coin coin){
        if (coin == null)
            return coin;
        System.out.print("Inspecting the coin...");
        Random r = new Random();
        // Fail 1 in 12 times
        if (r.nextInt(12) == 0) {
            System.out.print("Inspection FAILED!\n");
            return null;
        }
        System.out.print("Inspection PASSED!\n");
        return coin;
    }

    /**
     * Smooth the coin.
     *
     * @param the coin
     * @return the coin
     */
    public Coin smoothing(Coin coin) {
        if (coin != null)
            System.out.println("Smoothing the coin.");
        return coin;
    }

    /**
     * Buff the coin.
     *
     * @param the coin
     * @return the coin
     */
    public Coin buffing(Coin coin) {
        if (coin != null)
            System.out.println("buffing the coin");
        return coin;
    }
}
