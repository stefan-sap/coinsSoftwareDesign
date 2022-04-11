package coins;

/**
* CADDime.java
*/

/**
* CADDime is a realization of the coins abstraction.
*
* @author Olivia Hess
* @version 03/28/2022
*/

public class CADDime extends CADCoin {


  /**
  * No-arg constructor.
  * Sets all the fields appropriately.
  */
  public CADDime() {
    super("Dime", 0.10, new CAD_D_N());
  }
}
