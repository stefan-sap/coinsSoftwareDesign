package coins;

/**
* Dime.java
*/

/**
* Dime is a realization of the coins abstraction.
*
* @author Olivia Hess, Stefan Saponja
* @version 04/03/2022
*/

public class Dime extends USDCoin {
  /**
  * No-arg constructor.
  * Sets all the fields appropriately.
  */
  public Dime()
  {
    super("Dime", .10, new USD_HD_Q_D());
  }
}
