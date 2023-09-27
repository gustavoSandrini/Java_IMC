import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sim = true;

        while (sim) {
            System.out.println("Digite seu nome: ");
            String name = scanner.next();

            System.out.println("Digite sua altura: ");
            double height = scanner.nextDouble();

            System.out.println("Digite seu peso: ");
            double weight = scanner.nextDouble();

            double result = weight / (height * 2);

            DecimalFormat decimalFormat = new DecimalFormat(".##");

            if (result <= 18.5) {
                System.out.printf("Seu IMC é: %s. Está abaixo do peso ideal.%n", decimalFormat.format(result));
            } else if (result >= 18.6 && result <= 24.9) {
                System.out.printf("Seu IMC é: %s. Está no peso ideal.%n", decimalFormat.format(result));
            } else if (result >= 25.0 && result <= 29.9) {
                System.out.printf("Seu IMC é: %s. Você está com sobrepeso.%n", decimalFormat.format(result));
            } else if (result >= 30.0 && result <= 34.9) {
                System.out.printf("Seu IMC é: %s. Você está com obesidade grau I.%n", decimalFormat.format(result));
            } else if (result >= 35.0 && result <= 39.9) {
                System.out.printf("Seu IMC é: %s. Você está com obesidade grau II.%n", decimalFormat.format(result));
            } else {
                System.out.printf("Seu IMC é: %s. Você está com obesidade grau III.%n", decimalFormat.format(result));
            }

            System.out.println("Deseja realizar outro cálculo do IMC? (sim/não)");
            String resposta = scanner.next();

            sim = resposta.equalsIgnoreCase("sim");
        }

        // Fechar o scanner após o uso
        scanner.close();
    }
}