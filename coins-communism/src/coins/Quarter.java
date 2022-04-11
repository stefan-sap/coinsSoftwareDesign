package coins;

/**
* Quarter.java
*/

/**
* Quarter is a realization of the coins abstraction.
*
* @author Olivia Hess, Stefan Saponja
* @version 04/03/2022
*/

public class Quarter extends USDCoin {
  /**
  * No-arg constructor.
  * Sets all the fields appropriately.
  */
  public Quarter()
  {
    super("Quarter", .25, new USD_HD_Q_D());
  }
}
