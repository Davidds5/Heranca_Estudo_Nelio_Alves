package Estudo05Base.application;

import Estudo05Base.entities.Circle;
import Estudo05Base.entities.Rectangle;
import Estudo05Base.entities.Shape;
import Estudo05Base.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Shape> shapeList = new ArrayList<>();

        System.out.println("Enter the Number of shapes : ");
        int n = sc.nextInt();

        for (int i = 0; i <n; i++) {
            System.out.println("Shape #" + (i + 1) + " data: ");
            System.out.println("Rectangle or Circle (r/c): ");
            char resposta = sc.next().toLowerCase().charAt(0);

            System.out.println("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if(resposta == 'r'){
                System.out.println("Largura: ");
                double largura = sc.nextDouble();

                System.out.println("Altura: ");
                double altura = sc.nextDouble();

                shapeList.add(new Rectangle(largura, altura, color));

            } else {
                System.out.println("Raio: ");
                double raio = sc.nextDouble();

                shapeList.add(new Circle(raio, color));

            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : shapeList){
            System.out.println(String.format("%.2f",shape.area()));
        }
        sc.close();
    }
}
