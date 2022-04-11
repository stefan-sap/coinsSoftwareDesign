package coins;

public class USD_PENNY implements Smelting
{
    double[] ss = {2.5, 97.5, 0, 0};
    
    public double[] smeltSpecs()
    {
        return ss;
    }
}