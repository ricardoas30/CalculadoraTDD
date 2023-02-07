package br.edu.utfpr.calculadora.tdd;

/**
 *
 * @author Ricardo A. Silveira
 */
public enum Cargo {
    DESENVOLVEDOR, DBA, TESTADOR, GERENTE;
    
    private String descricao;

    public String getDescricao() {
        return descricao;
    }
}
