package Exercicios;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("digite a operacao (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.print("digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        double resultado;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("error.");
                    return;
                }
                resultado = num1 / num2;
                break;
            default:
                System.out.println("operador inexistente.");
                return;
        }

        System.out.println("resultado: " + resultado);
    }
}
