package coins;

/**
* CADQuarter.java
*/

/**
* CADQuarter is a realization of the coins abstraction.
*
* @author Olivia Hess
* @version 03/28/2022
*/

public class CADQuarter extends CADCoin {
  /**
  * No-arg constructor.
  * Sets all the fields appropriately.
  */
  public CADQuarter()
  {
    super("Quarter", 0.25, new CAD_L_T_Q());
  }
}
