package digitalinovationone.service.frete;

import digitalinovationone.service.Frete;

public class Normal implements Frete{
    public double calcularPreco(int distancia){
        return distancia * 1.25 + 10;
    }
}
