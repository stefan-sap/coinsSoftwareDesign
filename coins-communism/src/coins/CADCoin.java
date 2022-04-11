package coins;

/**
@author comrads
@version 4/2/2022
*/

/**
Abstract Coin determines the properties of a coin and which methods
need to be overridden by concrete realizations of a coin.
*/

public abstract class CADCoin extends Coin
{
    /**
    * Constructor for a CADCoin object.
    *
    * @param commonName is the common name for the coin.
    */
    public CADCoin(String commonName, double denomination, Smelting smeltSpec)
    {
        super("CAD", denomination, commonName, smeltSpec);

    }
}
