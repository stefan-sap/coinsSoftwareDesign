package coins;

/**
* CADLoonie.java
*/

/**
* CADLoonie is a realization of the coins abstraction.
*
* @author comrads
* @version 03/30/2022
*/

public class CADLoonie extends CADCoin {


  /**
  * No-arg constructor.
  * Sets all the fields appropriately.
  */
  public CADLoonie() {
    super("Loonie", 1.00, new CAD_L_T_Q());
  }
}
