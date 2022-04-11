package coins;

public class USD_NICKLE implements Smelting
{
    double[] ss = {75, 0, 0, 25};
    
    public double[] smeltSpecs()
    {
        return ss;
    }
}