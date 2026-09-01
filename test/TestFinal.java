package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestFinal {

    public static void main(String[] args) {

        Graficador graficador = new Graficador();

        Cuadrado cuadrado = new Cuadrado(
                "Cuadrado",
                "Rojo",
                5
        );

        Rectangulo rectangulo = new Rectangulo(
                "Rectangulo",
                "Azul",
                4,
                6
        );

        Triangulo triangulo = new Triangulo(
                "Triangulo",
                "Verde",
                4,
                6
        );

        TrianguloRectangulo trianguloRectangulo =
                new TrianguloRectangulo(
                        "Triangulo Rectangulo",
                        "Amarillo",
                        3,
                        4
                );

        Hexagono hexagono = new Hexagono(
                "Hexagono",
                "Morado",
                5
        );

        graficador.graficar(cuadrado);
        graficador.graficar(rectangulo);
        graficador.graficar(triangulo);
        graficador.graficar(trianguloRectangulo);
        graficador.graficar(hexagono);
    }
}