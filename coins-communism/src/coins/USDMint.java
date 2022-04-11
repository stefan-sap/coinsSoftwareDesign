package coins;

/**
 * Concrete Mint class for USD.
 *
 * @version 2022-03-28
 */
public class USDMint extends Mint {
    private static Mint instance;

    /**
     * Concrete getInstance method for USD.
     *
     * @return USDMint instance
     */
    public static Mint getInstance() {
        if (USDMint.instance == null) {
            synchronized(USDMint.class) {
                if (USDMint.instance == null) {
                    USDMint.instance = new USDMint();
                }
            }
        }
        return instance;
    }

    public Coin manufacture(String denomination) {
        Coin coin;

        try {
            coin = (USDCoin) Class.forName("coins." + denomination).newInstance();
        } catch (Exception e) {
            System.err.println("Failed to create coin of denomination " 
                    + denomination);
            System.err.println(e);
            coin = null;
        }

        return coin;
    }
}
