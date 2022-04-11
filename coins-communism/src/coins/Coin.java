package coins;

/**
<<<<<<< HEAD
@author comrads
=======
@author Stefan Saponja
>>>>>>> abstract-mint
@version 4/2/2022
*/

/**
Abstract Coin determines the properties of a coin and which methods
<<<<<<< HEAD
need to be overridden by concrete realizations of a coin.
=======
need to be overridden by concrete realizations of a coin. 
>>>>>>> abstract-mint
*/

public abstract class Coin
{
    //Store the size of the array in a final int.
    protected final int SPECS_SIZE = 4;
    //Store the metal composition of coins in an array.

    //Store the names of the metals in an array.
    protected String[] metals = {"Copper", "Zinc", "Magnesium", "Nickle"};

    //Coin fields.
    protected String countryCode;
    protected double denomination;
    protected String commonName;
    protected double[] smeltingSpecs;
    protected Smelting smeltSpecs;

    //Specification indices.
    public final int CU = 0;
    public final int ZI = 1;
    public final int MN = 2;
    public final int NI = 3;
    /**
    * Constructor for a Coin object.
    *
    * @param commonName is the common name for the coin.
    */
    public Coin(String countryCode, double denomination, String commonName, Smelting smeltSpec)
    {
        this.countryCode = countryCode;
        this.denomination = denomination;
        this.commonName = commonName;
        this.smeltingSpecs = smeltSpec.smeltSpecs();
    }

    /**
     * Determines common name of the coin.
     * Abstract coin does not know value, so subclass must implement.
     *
     * @return name of coin
    */
    public String getCommonName()
    {
        return this.commonName;
    }

    /**
     * Determines the value of the coin as a double.
     * Abstract coin does not know the value, so subclass must implement.
     *
     * @return is the value of the coin.
     */
    public double getDenomination() {
      return this.denomination;
    }

    /**
     * Determines the coin's nationality.
     * Abstract coin does not know the value, so subclass needd to implement
     *
     * @return is the nationality of the coin.
     */
    public String getCountryCode() {
      return this.countryCode;
    }

    /**
     * Determines smelting specs of a coin.
     * Abstract coin does not know value, so subclass must implement.
     *
     * @return smelting specs
    */
    public double[] getSmeltingSpecs() {

      return smeltingSpecs;
    }

    /**
     * Gets the description of the coin
     *
     * @return smelting specs
    */
    public String toString()
    {

        String toString = "";
        boolean hasMore = false;
        toString += "[" + getCountryCode() + " " + getCommonName() + " $" + String.format("%.2f", getDenomination()) + "][";
        for(int i = 0; i <= 3; i++)
        {
            if(smeltingSpecs[i] > 0)
            {
                toString +=  "%" + smeltingSpecs[i];
                toString +=  " " + metals[i];
                for(int j = i+1; j < smeltingSpecs.length; j++)
                {
                    if(smeltingSpecs[j] > 0)
                    {
                        hasMore = true;
                    }
                }
                if(hasMore)
                {
                    toString += ", ";
                }
                hasMore = false;
            }
        }
        return toString += "]";
    }
}
