package org.example;

import java.util.List;
import java.util.Set;

public class TrianguloChecker {
    public static boolean getIsTriangle(final Double lado1, final Double lado2, final Double lado3) {
        boolean isTriangle = false;

        if (lado1 == null || lado2 == null || lado3 == null) {
            isTriangle = false;
        } else if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            isTriangle = false;
        } else if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            isTriangle = true;
        }

        return isTriangle;
    }

    public static String getTriangleType(final Double lado1, final Double lado2, final Double lado3) {
        String message = "não é um triangulo";

        if (lado1 == null || lado2 == null || lado3 == null) {
            message = "os lados não podem ser nulos";
        } else if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            message = "os lados não podem ser menor que zero";
        } else if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            if (lado1.equals(lado2) && lado2.equals(lado3)) {
                message = "Equilatero";

            } else if (
                    ((lado1.equals(lado2) && !lado1.equals(lado3))
                    ||  (lado2.equals(lado3) && !lado2.equals(lado1))
                    ||  (lado3.equals(lado1) && !lado3.equals(lado2)))
            ) {
                message = "Isosceles";
            } else if (!lado1.equals(lado2) && !lado2.equals(lado3) && !lado3.equals(lado1)) {
                message = "Escaleno";
            }
        }

        return message;
    }


    public static void main(String[] args) {
    }
}