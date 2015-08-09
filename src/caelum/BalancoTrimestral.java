package caelum;

/**
 *
 * @author Michael
 */
public class BalancoTrimestral {
    public static void main(String[] args) {
        int gastosjaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        
        int gastosTrimestre = gastosjaneiro + gastosFevereiro + gastosMarco;
        
        System.out.println(gastosTrimestre);
        
        int mediaMensal = gastosTrimestre/3;
        System.out.println("Valor da média mensal = " + mediaMensal);

    }
}
