package Estudo02Final.entities.application;

import Estudo02Final.entities.entities.Animal;
import Estudo02Final.entities.entities.Cachorro;
import Estudo02Final.entities.entities.Gato;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal cachorro = new Cachorro("Bob");
        cachorro.emitirSom();
        System.out.println(cachorro.getNome() + "| Qual som ele faz: " + cachorro.emitirSom());

        Animal gato = new Gato("Teu");
        gato.emitirSom();
        System.out.println(gato.getNome() + "| Qual som ele faz: " + gato.emitirSom());


    }
}
