import java.util.Scanner;

public class EntradaDeDados {
    Scanner sc = new Scanner(System.in);

    // Perguntas básicas ->
    public int lerGenero() {
        System.out.println("Qual seu Gênero?\nDigite 1 para Homem e 2 para Mulher: ");
        return sc.nextInt();
    }

    public int lerIdade() {
        System.out.println("Qual é a sua idade?");
        return sc.nextInt();
    }

    public int lerAltura() {
        System.out.println("Qual é a sua Altura? Digite em centímetros (Ex: 1,60m é igual a 160cm)");
        return sc.nextInt();
    }

    public double lerPeso() {
        System.out.println("Quanto você pesa? Digite em kg com ponto (Ex: 57.3)");
        String pesoStr = sc.next().replace(",", ".");
        return Double.parseDouble(pesoStr);
    }

    // Pergunta sobre o Fator Atividade ->
    public int lerFatorAtividade() {
        System.out.println("Fator Atividade: \n1          Leve\n2          Moderada\n3          Alta\n");
        System.out.println("Digite o numero em que você se considera como fator atividade: ");
        return sc.nextInt();
    }

    // Pergunta sobre o objetivo da dieta ->
    public int lerObjetivo() {
        System.out.println("Seu Objetivo: \n1         Ganho de massa\n2          Déficit");
        System.out.println("Digite o numero do seu objetivo como alimentação:  ");
        return sc.nextInt();
    }

    public double lerKcal() {
        System.out.println("Quantos Kcal a menos ou a mais voce Desejaria na sua dieta?");
        return sc.nextDouble();
    }
}
