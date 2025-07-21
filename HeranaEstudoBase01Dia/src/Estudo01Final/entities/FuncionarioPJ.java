package Estudo01Final.entities;

public class FuncionarioPJ extends Funcionario {
    private Double valorProjeto;


    public FuncionarioPJ(Double valorProjeto, String nome, Double salarioBase) {
        super(nome, salarioBase);
        this.valorProjeto = valorProjeto;
    }

    @Override
    public double pagamento() {
        return salarioBase += valorProjeto;
    }
}
