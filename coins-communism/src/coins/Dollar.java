package coins;

/**
* Dollar.java
*/

/**
* Dollar is a realization of the coins abstraction.
*
* @author Olivia Hess, Stefan Saponja
* @version 04/03/2022
*/

public class Dollar extends USDCoin {
  
  /**
  * No-arg constructor.
  * Sets all the fields appropriately.
  */
  public Dollar()
  {
    super("Dollar", 1.00, new USD_DOLLAR());
  }
}
