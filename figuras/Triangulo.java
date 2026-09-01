package com.krakedev.figuras;

public class Triangulo extends Figura {

    private int base;
    private int altura;

    public Triangulo(String nombre, String color, int base, int altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int calcularPerimetro() {
        return 3 * base;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    @Override
    public String toString() {
        return "Triangulo [nombre=" + getNombre() +
               ", color=" + getColor() +
               ", base=" + base +
               ", altura=" + altura + "]";
    }
}