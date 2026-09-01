package com.krakedev.figuras;

public class Rectangulo extends Figura {

    private int base;
    private int altura;

    public Rectangulo(String nombre, String color, int base, int altura) {
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
        return 2 * base + 2 * altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectangulo [nombre=" + getNombre() +
               ", color=" + getColor() +
               ", base=" + base +
               ", altura=" + altura + "]";
    }
}