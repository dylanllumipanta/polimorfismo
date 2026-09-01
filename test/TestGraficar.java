package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;

public class TestGraficar {

    public static void main(String[] args) {

        Graficador graficador = new Graficador();

        Figura cuadrado = new Cuadrado(
                "Cuadrado",
                "Rojo",
                5
        );

        Figura rectangulo = new Rectangulo(
                "Rectangulo",
                "Azul",
                4,
                6
        );

        graficador.graficar(cuadrado);
        graficador.graficar(rectangulo);
    }
}