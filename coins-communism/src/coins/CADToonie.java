package coins;

/**
* CADToonie.java
*/

/**
* CADToonie is a realization of the coins abstraction.
*
* @author Olivia Hess
* @version 03/28/2022
*/

public class CADToonie extends CADCoin {

  /**
  * No-arg constructor.
  * Sets all the fields appropriately.
  */
  public CADToonie()
  {
    super("Toonie", 2.00, new CAD_L_T_Q());
  }

}
