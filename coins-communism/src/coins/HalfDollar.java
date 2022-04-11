package coins;

/**
* HalfDollar.java
*/

/**
* HalfDollar is a realization of the coins abstraction.
*
* @author Olivia Hess, Stefan Saponja
* @version 04/03/2022
*/

public class HalfDollar extends USDCoin {
  /**
  * No-arg constructor.
  * Sets all the fields appropriately.
  */
  public HalfDollar()
  {
    super("Half Dollar", .50, new USD_HD_Q_D());
  }
}
