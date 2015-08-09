package caelum;

/**
 *
 * @author Michael
 */
public class Casting {
    public static void main(String[] args)
    {
        double d3 = 3.14;
        System.out.println("Antes do casting: " + d3);
        int i = (int) d3;
        System.out.println("Casting: " + i);
        
        float x = 0.0F;//Permite a compilação pois o f ou F no final indica ao java
        //um literal float
    }
}
