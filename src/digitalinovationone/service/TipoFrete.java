package digitalinovationone.service;

import digitalinovationone.service.frete.Normal;
import digitalinovationone.service.frete.Pac;
import digitalinovationone.service.frete.Sedex;

public enum TipoFrete {
    
    NORMAL {
        @Override
        public Frete obterFrete() {
            return new Normal();
        }
    },
    SEDEX {
        @Override
        public Frete obterFrete() {
           return new Sedex();
        }
    },
    PAC{
        @Override
        public Frete obterFrete() {
           return new Pac();
         }
    };  
     public abstract Frete obterFrete();
}
