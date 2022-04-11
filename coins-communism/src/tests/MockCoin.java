package tests;

/**
 * MockCoin.java
 */
import coins.Coin;
import coins.NullSmelt;

/**
 * A realization of the abstract cookie class for testing.
 *
 * @author Communism
 * @version 02/19/2022
 */
public class MockCoin extends Coin {

    public static final String DESCRIPTION = "Mock Coin";

    /**
     * Constructs a mock cookie.
     */
     public MockCoin()
     {
         super("Mock", 0.0, DESCRIPTION, new NullSmelt());
      
     }

   /**
   * Concise output of object attributes (not word like description).
   *
   * @return object attributes string
    */
    public String toString()
    {
       String toString = "";
       toString += (getCountryCode() + " " + getCommonName() + " " + getDenomination());
       for(int i = 0; i < 4; i++)
       {
           if(smeltingSpecs[i] > 0 && i < 3)
           {
               toString +=  smeltingSpecs[i];
               toString +=  " " + metals[i];

               toString += ",";
           }
           else if(smeltingSpecs[i] > 0 && i == 3)
           {
               toString +=  smeltingSpecs[i];
               toString +=  " " + metals[i];
           }
       }
       return toString;
    }

   /**
   *getter for for Denomination value.
   *@return double - value of coin.
   */
    public double getDenomination()
    {
        return .00;
    }

   /**
   * getter for Country Code
   * @return String - Country Code
    */
   public String getCountryCode()
   {
       return "mockCoin";
   }

   /**
   *getter for commonName
   *@return String - Name of coin.
    */
    public String getCommonName()
    {
        return "Mock Coin";
    }
}
