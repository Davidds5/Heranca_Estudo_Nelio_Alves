package Estudo02Final.entities.entities;

public class Cachorro extends Animal {


    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return "Au Au Au Au";
    }
}
