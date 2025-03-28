package br.com.fecaf.model;

import java.util.Scanner;
import java.util.Arrays;

public class Triangulo {
    // definindo a classe
    public double base, altura, lado2, lado3, area, perimetro;
    private boolean cadastrado = false; // verifica se foi cadastrado mesmo

    Scanner scanner = new Scanner(System.in);

    // cadastrar triangulo
    public boolean cadastrarTriangulo() {
        System.out.println("**********");
        System.out.println("/** Cadastrando Triângulo */");
        System.out.println("**********");
        System.out.print("Informe a base: ");
        base = scanner.nextDouble();
        System.out.print("Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.print("Informe o lado 3: ");
        lado3 = scanner.nextDouble();
        System.out.print("Informe a altura: ");
        altura = scanner.nextDouble();
        System.out.println("**********");

        //ve se é valido
        if (!isTrianguloValido()) {
            System.out.println("Erro: Os lados informados não formam um triângulo válido!");
            return false;
        }

        cadastrado = true;
        return true;
    }

    // ve se os lados fazem um triangulo
    private boolean isTrianguloValido() {
        return (base + lado2 > lado3) && (base + lado3 > lado2) &&  (lado2 + lado3 > base);


    }

    // calcular a area do triangulo
    public void calcularArea() {
        if (!cadastrado) {
            System.out.println("Cadastre um triângulo primeiro!");
            return;
        }

        System.out.println("**********");
        System.out.println("/* Calculando Area */");
        System.out.println("**********");

        area = (base * altura) / 2;
        System.out.println("A area é: " + area);
        System.out.println("**********");
    }

    // calcula perimetro do triangulo
    public void calcularPerimetro() {
        if (!cadastrado) {
            System.out.println("Cadastre um triângulo primeiro!");
            return;
        }

        System.out.println("**********");
        System.out.println("/* calculando Perimetro */");
        System.out.println("**********");

        perimetro = base + lado2 + lado3;
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("**********");
    }

    // define tipo de triangulo
    public void definirTipo() {
        if (!cadastrado) {
            System.out.println("Cadastre um triângulo primeiro!");
            return;
        }

        System.out.println("**********");
        System.out.println("/* definindo tipo Triângulo */");
        System.out.println("**********");

        if (base == lado2 && base == lado3) {
            System.out.println("Esse triângulo é um Equilátero...");
        } else if (base != lado2 && base != lado3 && lado2 != lado3) {
            System.out.println("Esse triângulo é um Escaleno...");
        } else {
            System.out.println("Esse triângulo é Isósceles...");
        }

        // ve se tambem é retangulo
        if (isRetangulo()) {
            System.out.println("Esse triângulo também é Retângulo");
        }
    }

    //ve se o triangulo é retangulo
    private boolean isRetangulo() {
        double[] lados = { base, lado2, lado3 };
        Arrays.sort(lados);

        return Math.abs(Math.pow(lados[0], 2) + Math.pow(lados[1], 2) - Math.pow(lados[2], 2)) < 0.0001;
    }

    //ajuda a ver se o numero é mutiplo
    private boolean verificaMult(double num, double div) {
        return Math.abs(num % div) < 0.0001;
    }

    // pra ver se o padrao 3,4,5
    public void identificar345() {
        if (!cadastrado) {
            System.out.println("Cadastre um triângulo primeiro!");
            return;
        }

        System.out.println("**********");
        System.out.println("* Verificando triangulo *");
        System.out.println("**********");

        double[] lados = { base, lado2, lado3 };
        Arrays.sort(lados);

        // verifica se é mutiplo de 3,4,5
        if (verificaMult(lados[0], 3) && verificaMult(lados[1], 4) && verificaMult(lados[2], 5)) {
            double fator3 = lados[0] / 3;
            double fator4 = lados[1] / 4;
            double fator5 = lados[2] / 5;

            // verifica os fatores
            if (Math.abs(fator3 - fator4) < 0.0001 && Math.abs(fator3 - fator5) < 0.0001) {
                System.out.println("Esse triângulo segue o padrão 3-4-5 com fator " + fator3);
                return;
            }
        }

        // mensagem caso nao seja o padrao
        if (isRetangulo()) {
            System.out.println("Esse triângulo é retângulo, mas não segue o padrão 3-4-5");
        } else {
            System.out.println("Esse triângulo não é retângulo e não segue o padrão 3-4-5");
        }
    }
}