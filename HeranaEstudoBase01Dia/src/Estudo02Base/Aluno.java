package Estudo02Base;

// aluno pode usar os metodos de pessoa ou criar os seus proprios metodos
// aluno sera a class derivada
public class Aluno extends Pessoa{
    private String curso;

    public Aluno(){
        super();
    }

    public Aluno(String curso, String nome){
        super(nome);
        this.curso = curso;
    }
    public void estudar(){
        System.out.println(nome + " esta estudando " + curso);
    }
}
