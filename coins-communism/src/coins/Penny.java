package coins;

/**
* Penny.java
*/

/**
* Penny is a realization of the coins abstraction.
*
* @author Olivia Hess
* @version 03/28/2022
*/

public class Penny extends USDCoin {
  /**
  * No-arg constructor.
  * Sets all the fields appropriately.
  */
  public Penny()
  {
    super("Penny", .01, new USD_PENNY());
  }
}
