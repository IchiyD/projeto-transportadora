package digitalinovationone;
import java.util.Scanner;

import digitalinovationone.service.Frete;
import digitalinovationone.service.TipoFrete;
//import digitalinovationone.service.frete.Normal;

public class Test {
    
    public static void main(String[] args){
        try(Scanner leia = new Scanner(System.in)){
        System.out.println("Informe a distnância: ");
        int distancia = leia.nextInt();
        System.out.println("Qual é o tipo do frete (1) Normal, (2) Sedex, (3)PAC: ");
        int opcaoFrete = leia.nextInt();
        TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];
        
        Frete frete = tipoFrete.obterFrete();
        double preco = frete.calcularPreco(distancia);
        System.out.printf("O valor total é de R$%.2f", preco);
        }
    }
}
