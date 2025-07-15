package Estudo03Base.entities;

import Estudo03Base.application.Gerente;

public class Main {
    public static void main(String[] args) {


        Gerente gerente = new Gerente("Padaria", "Luis", 1200.0);
        gerente.mostraDados();
    }
}
