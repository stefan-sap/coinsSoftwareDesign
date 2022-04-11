package coins;

/**
* CADFiftyCent.java
*/

/**
* CADFiftyCent is a realization of the coins abstraction.
*
* @author Olivia Hess
* @version 03/28/2022
*/

public class CADFiftyCent extends CADCoin {

  /**
  * No-arg constructor.
  * sets all the fields appropriately.
  */
  public CADFiftyCent()
  {
    super("FiftyCent", 0.50, new CAD_F());
  }
}
