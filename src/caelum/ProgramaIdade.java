package caelum;

/**
 *
 * @author Michael
 */
public class ProgramaIdade {
    public static void main(String[] args)
    {
        Idade idade = new Idade(25);
        
        int totalIdade = idade.somaIdade(2);
        
        System.out.println("O total da idade é: " + totalIdade);
        
        int totalSubtracaoIdade = idade.subtraiIdade(2);
        
        System.out.println("O total da idade é: " + totalSubtracaoIdade);
        
        int totalMutiplarIdade = idade.multiplicarIdade(2);
        
        System.out.println("O total da idade é: " + totalMutiplarIdade);
        
        int totalDivisaoIdade = idade.dividirIdade(2);
        
        System.out.println("O total da idade é: " + totalDivisaoIdade);
        
        System.out.println("O total da idade é: " + idade.menorDeIdade());
    }
}
