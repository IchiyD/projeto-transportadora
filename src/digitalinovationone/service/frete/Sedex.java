package digitalinovationone.service.frete;

import digitalinovationone.service.Frete;

public class Sedex implements Frete{
    public double calcularPreco(int distancia){
        return distancia * 1.45 + 12;
    }
}
