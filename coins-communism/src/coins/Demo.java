package coins;

/**
*  Demo.java
* /

/**
* Demos our Coin creation.
*
* @author comrads
* @version 03/30/2022
*/

public class Demo {
  /**
  * Driver test method.
  *
  * param args - unused
  */

  public static void main(String [] args) {
      Mint usd = new USDMint();
      Mint cad = new CADMint();

      System.out.println("#######################");
      System.out.println("# Testing the USDMint #");
      System.out.println("#######################");
      String[] usCoins = {"Dollar", "HalfDollar", "Nickel", "Penny",
          "Quarter"};
      for (String coin : usCoins) {
          System.out.println("Making a " + coin);
          System.out.println(usd.makeCoin(coin));
          System.out.println();
      }

      System.out.println("#######################");
      System.out.println("# Testing the CADMint #");
      System.out.println("#######################");
      String[] cadCoins = { "CADDime", "CADFiftyCent",
          "CADLoonie", "CADNickel", "CADQuarter", "CADToonie", };

      for (String coin : cadCoins) {
          System.out.println("Making a " + coin);
          System.out.println(cad.makeCoin(coin));
          System.out.println();
      }
  }
}
