package ProjetoEstudo01.entites;

public class Cliente extends Usuario{
    private int pontosFidelidade;


    public Cliente(String nome, String email, int pontosFidelidade) {
        super(nome, email);
        this.pontosFidelidade = pontosFidelidade;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }


    public String toString(){
        return super.toString() + "| Pontos de Fidelidade:  " + pontosFidelidade;
    }
}
