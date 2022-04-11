package coins;

/**
* Nickel.java
*/

/**
* Nickel is a realization of the coins abstraction.
*
* @author Olivia Hess, Stefan Saponja
* @version 04/03/2022
*/

public class Nickel extends USDCoin {
  /**
  * No-arg constructor.
  * Sets all the fields appropriately.
  */
  
  public Nickel()
  {
    super("Nickle", .05, new USD_NICKLE());
  }
}
