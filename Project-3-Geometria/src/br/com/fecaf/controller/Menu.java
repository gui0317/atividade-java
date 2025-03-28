package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void executarMenu() {

        boolean exit = false;

        while (!exit) {

            System.out.println("/********/");
            System.out.println("/*      Geometria       */");
            System.out.println("/********/");
            System.out.println("/* 1 - Circulo          */");
            System.out.println("/* 2 - Retângulo        */ ");
            System.out.println("/* 3 - Triângulo        */");
            System.out.println("/* 4 - Sair             */");
            System.out.println("/********/");
            System.out.print("Informe a opção desejada:");

            int optionUser = scanner.nextInt();

            switch (optionUser) {
                case 1:

                    boolean exitCirculo = false;

                    boolean validaCadastro = false;

                    Circulo circulo = new Circulo();
                    while (!exitCirculo) {

                        System.out.println("/*********/");
                        System.out.println("/*        Circulo        */");
                        System.out.println("/*********/");
                        System.out.println("/* 1 - Cadastrar Circulo */");
                        System.out.println("/* 2 - Calcular Area     */");
                        System.out.println("/* 3 -Calcular Perimetro */");
                        System.out.println("*/ 4 - Sair              */");
                        System.out.println("/*********/");

                        System.out.print("Escolha uma opção: ");

                        int optionCirculo = scanner.nextInt();

                        switch (optionCirculo) {
                            case 1:
                                System.out.println("Cadastrando Circulo...");
                                validaCadastro = circulo.cadastrarCirculo();
                                break;
                            case 2:
                                if (validaCadastro) {
                                    System.out.println("Calculando Área");
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Circulo..");
                                }
                                break;
                            case 3:
                                if (validaCadastro) {
                                    System.out.println("Calculando Perimetro...");
                                    circulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Circulo..");
                                }
                                break;
                            case 4:
                                System.out.println("Voltando para Menu...");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Opção Inválida...");
                        }

                    }
                    break;
                case 2:

                    boolean exitRetangulo = false;

                    // Esse comando cria um objeto
                    Retangulo retangulo = new Retangulo();
                    boolean validaRetangulo = false;

                    while (!exitRetangulo) {
                        System.out.println("/*********/");
                        System.out.println("/*       Retângulo       */");
                        System.out.println("/*********/");
                        System.out.println("/* 1 - Cadastrar Retângulo */");
                        System.out.println("/* 2 - Calcular Area       */");
                        System.out.println("/* 3 - Calcular Perimetro  */");
                        System.out.println("/* 4 - Definir Quadrado    */");
                        System.out.println("*/ 5 - Sair                */");
                        System.out.println("/*********/");

                        System.out.print("Escolha uma opção: ");

                        int optionRetangulo = scanner.nextInt();

                        switch (optionRetangulo) {
                            case 1:
                                System.out.println("/**********/");
                                System.out.println("/*  Cadastrando Retângulo */");
                                System.out.println("/**********/");
                                validaRetangulo = retangulo.cadastrarRetangulo();
                                System.out.println("/**********/");

                                break;
                            case 2:
                                if (validaRetangulo) {
                                    System.out.println("Calculando Área");
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Retângulo..");
                                }
                                break;
                            case 3:
                                if (validaRetangulo) {
                                    System.out.println("Calculando Perimetro...");
                                    retangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Retângulo..");
                                }
                                break;

                            case 4:
                                System.out.println("/* Definindo Quadrado  */");
                                if (validaRetangulo) {
                                    retangulo.validarQuadrado();
                                }
                                break;

                            case 5:
                                System.out.println("Saindo...");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida..");
                        }
                    }

                    break;
                case 3:

                    boolean exitTriangulo = false;

                    // Esse comando cria um objeto
                    Triangulo triangulo = new Triangulo();
                    boolean validaTriangulo = false;

                    while (!exitTriangulo) {
                        System.out.println("/*********/");
                        System.out.println("/*       Triangulo       */");
                        System.out.println("/*********/");
                        System.out.println("/* 1 - Cadastrar Triangulo */");
                        System.out.println("/* 2 - Calcular Area       */");
                        System.out.println("/* 3 - Calcular Perimetro  */");
                        System.out.println("/* 4 - Definir Triangulo    */");
                        System.out.println("/* 5 - Definir Especial    */");
                        System.out.println("*/ 6 - Sair                */");
                        System.out.println("/*********/");

                        System.out.print("Escolha uma opção: ");

                        int optionTriangulo = scanner.nextInt();

                        switch (optionTriangulo) {
                            case 1:
                                System.out.println("/**********/");
                                System.out.println("/*  Cadastrando Triangulo */");
                                System.out.println("/**********/");
                                validaTriangulo = triangulo.cadastrarTriangulo();
                                System.out.println("/**********/");

                                break;
                            case 2:
                                if (validaTriangulo) {
                                    System.out.println("Calculando Área");
                                    triangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Triangulo...");
                                }
                                break;
                            case 3:
                                if (validaTriangulo) {
                                    System.out.println("Calculando Perimetro...");
                                    triangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Triangulo...");
                                }
                                break;

                            case 4:
                                System.out.println("Definindo tipo...");
                                triangulo.definirTipo();
                                break;

                            case 5:
                                System.out.println("Definindo 345...");
                                triangulo.identificar345();
                                break;

                            case 6:
                                System.out.println("Saindo...");
                                exitTriangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida...");
                                break;
                        }
                    }
                case 4:
                    System.out.println("Saindo ...");
                    exit = true;
                    break;
                default:
                    System.out.println("Opção Inválida...");


            }
        }
    }
}