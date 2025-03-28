package br.com.fecaf.model;

import java.util.Scanner;

public class Circulo {
    // Isso Cria um atributo
    public double raio, area, perimetro, diametro;

    /* Instancia o Objeto Scanner */
    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarCirculo () {
        System.out.println("/********/");
        System.out.println("/* Cadastro Círculo */");
        System.out.println("/********/");
        System.out.println("Informe o raio: ");
        raio = scanner.nextDouble();
        System.out.println("Circulo Cadastrado com Sucesso...");
        System.out.println("/************/");

        return true;
    }

    public void exibirCirculo (){
        System.out.println("/**************/");
        System.out.println("O raio do circulo é: " + raio);
        System.out.println("A area do circulo é: " + area);
        System.out.println("O perimetro do circulo é: " + perimetro);
        System.out.println("O diametro do circulo é: " + diametro);
        System.out.println("/***************/");
    }

    public void calcularArea() {
        System.out.println("/*  Calculando Area  */");

        area = 3.14159 * (raio * raio);
        System.out.println("a area do circulo "+area);
    }

    public void calcularPerimetro () {
        System.out.println("/*      Calculando Perimetro    */");
        System.out.println("perimetro é "+perimetro);

        perimetro = Math.PI * 2 * raio;
    }
}