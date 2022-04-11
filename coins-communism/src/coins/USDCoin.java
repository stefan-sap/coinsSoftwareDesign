package coins;

/**
@author Stefan Saponja
@version 4/2/2022
*/

/**
Abstract Coin determines the properties of a coin and which methods
need to be overridden by concrete realizations of a coin.
*/

public abstract class USDCoin extends Coin
{
  /**
  * Constructor for a USDCoin object.
  *
  * @param commonName is the common name for the coin.
  */
  public USDCoin(String commonName, double denomination, Smelting smeltSpec)
  {
    super("USD", denomination, commonName, smeltSpec);
  }
}
