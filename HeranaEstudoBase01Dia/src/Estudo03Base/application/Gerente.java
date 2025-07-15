package Estudo03Base.application;

public class Gerente extends Funcionario{
    private String departamento;


    public Gerente(String departamento, String nome, Double salario) {
        super(nome, salario);
        this.departamento = departamento;
    }

   @Override
    public void mostraDados(){
        super.mostraDados();
       System.out.println("Departamento: " + departamento);
   }
}
