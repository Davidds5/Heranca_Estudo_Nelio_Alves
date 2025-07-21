package Estudo05Base.entities;

import Estudo05Base.enums.Color;

import java.util.Map;

public class Circle extends Shape{
    private Double raio;

    public Circle(){}

    public Circle(Double raio, Color color){
        super(color);
        this.raio = raio;
    }
    @Override
    public double area() {
        return Math.PI * raio * raio;


    }
}
