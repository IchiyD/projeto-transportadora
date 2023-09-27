package digitalinovationone.service.frete;

import digitalinovationone.service.Frete;

public class Pac implements Frete {
    public double calcularPreco(int distancia){
        return distancia * 1.30 + 10;
    }
    
}
