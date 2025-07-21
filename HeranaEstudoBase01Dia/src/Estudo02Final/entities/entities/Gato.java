package Estudo02Final.entities.entities;

public class Gato extends Animal {


    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return "Miau Miau";
    }
}
