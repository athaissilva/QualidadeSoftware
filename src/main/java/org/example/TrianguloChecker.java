package org.example;

import java.util.List;
import java.util.Set;

public class TrianguloChecker {
    private Double lado1;
    private Double lado2;
    private Double lado3;

    private String message;
    private boolean isTriangle;


    public String getMessage(){
        return this.message;
    }
    public boolean isTriangle(){
        return this.isTriangle;
    }


    public void setLados(final Double lado1, final Double lado2, final Double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    public void verificaTriangulo() {

        if (lado1 == null || lado2== null || lado3 == null ){
            this.isTriangle = false;
            this.message =  "não existe lado nulo em um traingulo";
        }
        else if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            this.isTriangle = false;
            this.message = "os lados não podem ser negativos ou igual a zero";
        }

        else if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            this.isTriangle = true;
            this.message =  "os lados formam um triângulo";
        } else {
            this.isTriangle = false;
            this.message = "deconhecido";
        }
    }

    public static void main(String[] args) {
    }
}