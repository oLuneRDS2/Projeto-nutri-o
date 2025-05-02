public class Main {
    public static void main(String[] args) {
        EntradaDeDados entrada = new EntradaDeDados();

        // Perguntas básicas ->
        int g1 = entrada.lerGenero();
        int idade = entrada.lerIdade();
        int altura = entrada.lerAltura();
        double peso = entrada.lerPeso();

        // Pergunta sobre o Fator Atividade ->
        int ft = entrada.lerFatorAtividade();

        double ft2;
        switch (ft) {
            case 1:
                ft2 = 1.3;
                break;
            case 2:
                ft2 = 1.5;
                break;
            case 3:
                ft2 = 1.7;
                break;
            default:
                System.out.println("Opção inválida, considerando fator moderado.");
                ft2 = 1.5;
        }

        // Cálculo final da Taxa Metabólica e do Gasto Energético Total ->
        double taxa_mb = 0.0;
        if (g1 == 1) {
            taxa_mb = (13.75 * peso) + (5 * altura) - (6.8 * idade) + 66.5;
        } else if (g1 == 2) {
            taxa_mb = 655.1 + (9.56 * peso) + (1.85 * altura) - (4.67 * idade);
        }

        double get = ft2 * taxa_mb;
        System.out.printf("Esta é a sua Taxa Metabolica Basal (TMB): %.2f%n", taxa_mb);
        System.out.printf("Esta é o seu Gasto Energético Total (GET): %.2f kcal%n", get);

        // Cálculo do GET final com o objetivo da dieta ->
        int obj = entrada.lerObjetivo();
        double kcal = entrada.lerKcal();

        switch (obj) {
            case 1:
                get += kcal;
                System.out.printf("Para ganhar massa, seu novo GET é: %.2f kcal%n", get);
                break;
            case 2:
                get -= kcal;
                System.out.printf("Para perder gordura, seu novo GET é: %.2f kcal%n", get);
                break;
        }

        // Nutrientes ->
        double prot;
        if (ft == 1) {
            prot = peso * 0.8;
        } else if (ft == 2) {
            prot = peso * 1.5;
        } else {
            prot = peso * 2.0;
        }

        double protKcal = prot * 4;

        double lip = peso;
        double lipKcal = lip * 9;

        double carboKcal = get - (protKcal + lipKcal);
        double carbo = carboKcal / 4;

        System.out.printf("Proteínas: %.1f g = %.1f kcal%n", prot, protKcal);
        System.out.printf("Lípideos (gorduras): %.1f g = %.1f kcal%n", lip, lipKcal);
        System.out.printf("Carboidratos: %.1f g = %.1f kcal%n", carbo, carboKcal);
    }
}
