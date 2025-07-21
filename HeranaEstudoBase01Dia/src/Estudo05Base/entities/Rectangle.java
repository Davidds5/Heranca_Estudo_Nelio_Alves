package Estudo05Base.entities;

import Estudo05Base.enums.Color;

public class Rectangle extends Shape {
    private Double largura;
    private Double altura;

    public Rectangle(Double largura, Double altura, Color color) {
        super(color);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double area() {
        return largura * altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
