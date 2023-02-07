package br.edu.utfpr.calculadora.tdd;

import java.util.ArrayList;

/**
 *
 * @author Ricardo A. Silveira
 */
public final class CalculadoraTDD { 
    ArrayList<Funcionario> dados;
    
    public CalculadoraTDD() {
        dados = new ArrayList<>();
        
        Inicio();
    }
    
    public static void main(String[] args) {
        new CalculadoraTDD();
    }
    
    public void Inicio() {}
    
    
    /**
     * Metodo responsavel por cadastrar o funcionario.
     * @param nome
     * @param email
     * @param cargo
     * @param salarioBase 
     */
    public float Funcionario(Funcionario func) {
       float resp = 0; 
       dados.add(func);
       
       for(int i=0; i<dados.size(); i++) {
            resp = Desconto(dados.get(i).cargo, dados.get(i).salarioBase);
       }
       return resp;
    }

    
    /**
     * Metodo responsavel por calcular os descontos.
     * @param cargo
     * @param salarioBase 
     */
    public float Desconto(Cargo cargo, float salarioBase) {
        float res = 0;
        
        if(cargo == Cargo.DESENVOLVEDOR) {
            
            if(salarioBase >= 3000) {
                // desconto de 20%
                res = (salarioBase - (salarioBase * 20 / 100));
            } else {
                // desconto de 10%
                res = (salarioBase - (salarioBase * 10 / 100));
            }   
        }
        
        if(cargo == Cargo.DBA) {
            
            if(salarioBase >= 2000) {
                // desconto de 25%
                res = (salarioBase - (salarioBase * 25 / 100));
            } else {
                // desconto de 15%
                res = (salarioBase - (salarioBase * 15 / 100));
            }
        }
        
        if(cargo == Cargo.TESTADOR) {
            
            if(salarioBase >= 2000) {
                // desconto de 25%
                res = (salarioBase - (salarioBase * 25 / 100));
            } else {
                // desconto de 15%
                res = (salarioBase - (salarioBase * 15 / 100));
            }   
        }
        
        if(cargo == Cargo.GERENTE) {
            
            if(salarioBase >= 5000) {
                // desconto de 30%
                res = (salarioBase - (salarioBase * 30 / 100));
            } else {
                // desconto de 20%
                res = (salarioBase - (salarioBase * 20 / 100));
            }   
        }
        return res;
    }
}
