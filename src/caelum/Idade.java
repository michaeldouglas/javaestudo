/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caelum;

/**
 *
 * @author Michael
 */
public class Idade {
    protected int idade;
    
    
    Idade(int idade){
        this.idade = idade;
    }
    
    public int somaIdade(int num)
    {
        return idade + num;
    }
    
    public int subtraiIdade(int num)
    {
        return idade - num;
    }
    
    public int multiplicarIdade(int num)
    {
        return idade * num;
    }
    
    public int dividirIdade(int num)
    {
        return idade / num;
    }
    
    public boolean menorDeIdade()
    {
        return idade < 18;
    }
}
