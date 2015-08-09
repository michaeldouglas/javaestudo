package caelum;

/**
 *
 * @author Michael
 */
public class Condicoes {
    public static void main(String[] args)
    {
        int idade = 15;
        boolean amigoDoDono = true;
        
        if (idade < 18 && !amigoDoDono) {
            System.out.println("Não pode entrar na festa!!!!");
        } else {
            System.out.println("Pode entrar na festa!!!");
        }
    }
}
