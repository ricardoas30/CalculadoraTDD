package br.edu.utfpr.calculadora.tdd;

/**
 *
 * @author Ricardo A. Silveira
 */
public class Funcionario {
    String nome;
    String email;
    Cargo cargo;
    float salarioBase;

    public Funcionario(String nome, String email, Cargo cargo, float salarioBase) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
}
