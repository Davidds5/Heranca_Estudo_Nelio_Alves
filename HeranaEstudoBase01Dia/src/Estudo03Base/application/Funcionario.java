package Estudo03Base.application;

public class Funcionario {
    private String nome;
    private Double salario;

    public Funcionario(){}

    public Funcionario(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void mostraDados(){
        System.out.println("Nome: " + nome +"\n" + "Salario: " + salario);
    }
}
