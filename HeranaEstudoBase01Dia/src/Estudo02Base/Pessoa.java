package Estudo02Base;


// pessoa sera a class base ou (superclass)
public class Pessoa {
   protected String nome;
   private int idade;

    public Pessoa(){}

    public Pessoa(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void apresentar(){
        System.out.println("Nome " + nome + ", idade " + idade);
    }


}
