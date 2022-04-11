package coins;

public class NullSmelt implements Smelting
{
    double[] ss = {0, 0, 0, 0};

    public double[] smeltSpecs()
    {
        return ss;
    }
}
