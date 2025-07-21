package Estudo01Final.entities;

public class FuncionarioCLT extends Funcionario {
    private Double beneficios;


    public FuncionarioCLT(Double beneficios, String nome, Double salarioBase) {
        super(nome, salarioBase);
        this.beneficios = beneficios;
    }

    public Double getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(Double beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public double pagamento() {
       return salarioBase += beneficios;
    }
}
