package coins;

/**
* CADNickel.java
*/

/**
* CADNickel is a realization of the coins abstraction.
*
* @author Olivia Hess
* @version 03/28/2022
*/

public class CADNickel extends CADCoin {
  /**
  * No-arg constructor.
  * Sets all the fields appropriately.
  */
  public CADNickel()
  {
    super("Nickel", 0.05, new CAD_D_N());
  }
}
