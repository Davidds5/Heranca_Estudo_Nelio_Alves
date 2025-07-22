package ProjetoEstudo01.entites;

public class Admistrador extends Usuario{
    private String setor;

    public Admistrador(String nome, String email, String setor) {
        super(nome, email);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public String toString(){
        return super.toString() + "| Setor: " + setor;
    }
}
