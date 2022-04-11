package coins;

/**
 * Concrete Mint class for USD.
 *
 * @version 2022-03-28
 */
public class CADMint extends Mint {
    private static Mint instance;
    /**
     * Concrete getInstance method for USD.
     *
     * @return USDMint instance
     */
    public static Mint getInstance() {
        if (CADMint.instance == null) {
            synchronized(CADMint.class) {
                if (CADMint.instance == null) {
                    CADMint.instance = new CADMint();
                }
            }
        }
        return CADMint.instance;
    }

    public Coin manufacture(String denomination) {
        Coin coin;

        try {
            coin = (CADCoin) Class.forName("coins." + denomination).newInstance();
        } catch (Exception e) {
            System.err.println("Failed to create coin of denomination " 
                    + denomination);
            System.err.println(e);
            coin = null;
        }

        return coin;
    }
}
