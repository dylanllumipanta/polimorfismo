package com.krakedev.figuras;

public class TrianguloRectangulo extends Figura {

    private int catetoA;
    private int catetoB;
    private double hipotenusa;

    public TrianguloRectangulo(String nombre, String color, int catetoA, int catetoB) {
        super(nombre, color);
        this.catetoA = catetoA;
        this.catetoB = catetoB;
        this.hipotenusa = Math.sqrt(
                (catetoA * catetoA) + (catetoB * catetoB)
        );
    }

    public int getCatetoA() {
        return catetoA;
    }

    public void setCatetoA(int catetoA) {
        this.catetoA = catetoA;
        calcularHipotenusa();
    }

    public int getCatetoB() {
        return catetoB;
    }

    public void setCatetoB(int catetoB) {
        this.catetoB = catetoB;
        calcularHipotenusa();
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    private void calcularHipotenusa() {
        hipotenusa = Math.sqrt(
                (catetoA * catetoA) + (catetoB * catetoB)
        );
    }

    @Override
    public int calcularPerimetro() {
        return (int) (catetoA + catetoB + hipotenusa);
    }

    @Override
    public double calcularArea() {
        return (catetoA * catetoB) / 2.0;
    }

    @Override
    public String toString() {
        return "TrianguloRectangulo [nombre=" + getNombre() +
               ", color=" + getColor() +
               ", catetoA=" + catetoA +
               ", catetoB=" + catetoB +
               ", hipotenusa=" + hipotenusa + "]";
    }
}