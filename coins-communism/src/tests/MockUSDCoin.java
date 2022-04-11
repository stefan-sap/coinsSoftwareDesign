package tests;

/**
 * MockUSDCoin.java
 */
import coins.USDCoin;
import coins.NullSmelt;

/**
 * A realization of the abstract USDCoin class for testing.
 *
 * @author Communism
 * @version 04/02/2022
 */
public class MockUSDCoin extends USDCoin {

    /**
     * Constructs a mock cookie.
     */
     public MockUSDCoin()
     {
         super("Mock", 0.0, new NullSmelt());
       
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
   *@return double - value of USDCoin.
   */
    public double getDenomination()
    {
        return .00;
    }
    
   /**
   *getter for commonName
   *@return String - Name of USDCoin.
    */
    public String getCommonName()
    {
        return "Mock USDCoin";
    }
}