package Exercicios;

import java.util.Scanner;

public class lista1Poo {

    /* 1.Faça um programa para calcular o estoque médio de uma peça, sendo que: * estoque médio = (quantidade_minima + quantidade_máxima) / 2. */

    public static void q1() {

        Scanner scanf = new Scanner(System.in);

        double qtdMin, qtdMax, estoqueMedio;

        System.out.println("Qual a quantidade minima:");
        qtdMin = scanf.nextDouble();

        System.out.println("Qual a quantidade maxima:");
        qtdMax = scanf.nextDouble();

        estoqueMedio = (qtdMin + qtdMax) / 2;

        System.out.printf("O estoque medio eh = %.2f\n", estoqueMedio);

        scanf.close();
    }


    /*
     * 2.Faça um programa que: Leia a cotação do dólar Leia um valor em dólares Converta esse valor para Real Mostre o resultado
     */

    public static void q2() {
        Scanner scanf = new Scanner(System.in);

        double cotacao, dolares, real;

        System.out.println("Qual a cotacao do dolar:");
        cotacao = scanf.nextDouble();

        System.out.println("Quantos dolares quer converter?:");
        dolares = scanf.nextDouble();

        real = cotacao * dolares;

        System.out.printf("O valor convertido eh: %.2f", real);

        scanf.close();
    }


    /* 3.Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
    comissão será de 5% do total da venda e que você tem os seguintes dados:
    Identificação do vendedor
    Código da peça
    Preço unitário da peça
    Quantidade vendida
     */

    public static void q3() {
        Scanner scanf = new Scanner(System.in);

        String idVendedor;
        int codPeca, qtdVendida;
        double precoUni, comissao_vendedor, total_vendas;

        System.out.println("Digite a identificação do vendedor:");
        idVendedor = scanf.next();

        System.out.println("Digite o código da peca:");
        codPeca = scanf.nextInt();

        System.out.println("Digite o preço unitário da peca:");
        precoUni = scanf.nextDouble();

        System.out.println("Digite a quantidade de pecas vendidas:");
        qtdVendida = scanf.nextInt();

        total_vendas = precoUni * qtdVendida;
        comissao_vendedor = total_vendas * 0.05;

        System.out.printf("O total de vendas do vendedor %s (codigo da peca: %d) foi de R$ %.2f e a sua comissao eh de R$ %.2f.\n",
                idVendedor, codPeca, total_vendas, comissao_vendedor);

        scanf.close();
    }


    /* 4.Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os valores lidos, baseando-se na utilização do conceito de propriedade distributiva.
     Dica: se forem lidas as variáveis A, B, C e D,
     devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B com D e por último C com D.
     Note que para cada operação serão utilizadas seis combinações. Assim sendo, devem ser realizadas doze operações
     de processamento, sendo seis para as adições e seis para as multiplicações.
     */

    public static void q4() {
        Scanner scanf = new Scanner(System.in);

        int A, B, C, D;

        System.out.println("Digite um valor numero para A:");
        A = scanf.nextInt();
        System.out.println("Digite um valor numero para B:");
        B = scanf.nextInt();
        System.out.println("Digite um valor numero para C:");
        C = scanf.nextInt();
        System.out.println("Digite um valor numero para D:");
        D = scanf.nextInt();

        System.out.println("6 combinacoes. \n 6 Somas. \n 6 Produtos.");

        System.out.println();

        System.out.println("A + B = " + (A + B));

        System.out.println("A + C = " + (A + C));

        System.out.println("A + D = " + (A + D));

        System.out.println("B + C = " + (B + C));

        System.out.println("B + D = " + (B + D));

        System.out.println("C + D = " + (C + D));

        System.out.println();

        System.out.println("A * B = " + (A * B));

        System.out.println("A * C = " + (A * C));

        System.out.println("A * D = " + (A * D));

        System.out.println("B * C = " + (B * C));

        System.out.println("B * D = " + (B * D));

        System.out.println("C * D = " + (C * D));

        scanf.close();
    }


    /*
     * 5.Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
      Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula: LITROS_USADOS = DISTANCIA / 12.
      O programa deve apresentar os valores da velocidade média, tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem.
      Dica: trabalhe com valores reais
     */

    public static void q5() {
        Scanner scanf = new Scanner(System.in);

        double tempoGasto, velocidadeMed, distancia, ltsUsados;

        System.out.println("Digite o tempo gasto na viagem em horas:");
        tempoGasto = scanf.nextDouble();

        System.out.println("Digite a velocidade media em Km/h:");
        velocidadeMed = scanf.nextDouble();

        distancia = tempoGasto * velocidadeMed;
        ltsUsados = distancia / 12;

        System.out.printf("Sua velocidade media foi de %.2f Km/h", velocidadeMed);
        System.out.println();
        System.out.printf("Seu tempo gasto foi de %.2f Horas", tempoGasto);
        System.out.println();
        System.out.printf("A distancia que o automovel percorreu foi de %.2f Km", distancia);
        System.out.println();
        System.out.printf("Foram gastos %.2f L de combustivel ", ltsUsados);

        scanf.close();

    }


    /*
    6. Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit.
    A fórmula de conversão de temperatura a ser utilizada é F = (9 * C + 160) / 5.
    Em que a variável F representa é a temperatura em graus Fahrenheit e a variável C representa é a temperatura em graus Celsius.
     */

    public static void q6() {
        Scanner scanf = new Scanner(System.in);

        double c, f;

        System.out.println("Conversor de Celsius para Fahrenheit.");
        System.out.println("Digite a temperatura em Celsius:");
        c = scanf.nextDouble();

        f = (9 * c + 160) / 5;

        System.out.printf("%.2f Celsius em Fahrenheit eh %.2f\n",c, f);

        scanf.close();
    }


    /*
    7. Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius.
    A fórmula de conversão de temperatura a ser utilizada é C = (F - 32) * 5 / 9.
    Em que a variável F é a temperatura em graus Fahrenheit e a variável C é a temperatura em graus Celsius.
     */

    public static void q7() {
        Scanner scanf = new Scanner(System.in);

        double c, f;

        System.out.println("Conversor de Fahrenheit para Celsius.");
        System.out.println("Digite a temperatura em Fahrenheit:");
        f = scanf.nextDouble();

        c = (f - 32) * 5 / 9;

        System.out.printf("%.2f Fahrenheit em Celsius eh %.2f\n",f, c);

        scanf.close();
    }


    /*
    8. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
    V = 3.14159 R R * A Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
     */

    public static void q8() {
        Scanner scanf = new Scanner(System.in);

        double vol, raio, alt;

        System.out.println("Digite o raio da lata :");
        raio = scanf.nextDouble();

        System.out.println("Digite a altura da lata :");
        alt = scanf.nextDouble();

        vol = 3.14159 * (Math.pow(raio, 2)) * alt;

        System.out.printf("O volume da lata eh: %.2f cm³\n", vol);

        scanf.close();
    }



    /*
    9. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
        Considerar ano com 365 dias e mês com 30 dias.
     */

    public static void q9() {
        Scanner scanf = new Scanner(System.in);

        int iddAnos, iddDias, iddMeses, totalDias;

        System.out.println("Digite sua idade em dias:");
        iddDias = scanf.nextInt();

        System.out.println("Digite sua idade em meses:");
        iddMeses = scanf.nextInt();

        System.out.println("Digite sua idade em anos:");
        iddAnos = scanf.nextInt();

        totalDias = (iddAnos * 365) + (iddMeses * 30) + iddDias;

        System.out.printf("Sua idade em anos eh %d\n", iddAnos);
        System.out.printf("Sua idade em meses eh %d\n", iddMeses);
        System.out.printf("Sua idade em dias eh %d\n", iddDias);
        System.out.printf("Sua idade total em dias : %d\n", totalDias);

        scanf.close();

    }


    /*
    10. Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos de ordem existentes entre eles.
    Os relacionamentos possíveis são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
    */

    public static void q10() {
        Scanner scanf = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite o primeiro numero:");
        num1 = scanf.nextInt();

        System.out.println("Informe o segundo numero:");
        num2 = scanf.nextInt();

        System.out.println("numeros iguais: " + (num1 == num2));
        System.out.println("numeros nao iguais: " + (num1 != num2));
        System.out.println("maior: " + (num1 > num2));
        System.out.println("menor: " + (num1 < num2));
        System.out.println("maior ou igual: " + (num1 >= num2));
        System.out.println("menor ou igual: " + (num1 <= num2));

        scanf.close();
    }

    // Nível 2: Estruturas Condicionais

    /*
    2.1  Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a possuir o valor da variável B, e a variável B passe a possuir o valor da variável A.
         Apresentar os valores antes e depois da troca.
     */

    public static void q11() {
        Scanner scanf = new Scanner(System.in);

        int A, B, trocar;

        System.out.println("Digite o valor de A:");
        A = scanf.nextInt();

        System.out.println("Digite o valor de B:");
        B = scanf.nextInt();

        System.out.printf("valor de A: %d\n", A);

        System.out.printf("valor de B: %d\n", B);

        trocar = A;
        A = B;
        B = trocar;

        System.out.printf("valor de A: %d\n", A);

        System.out.printf("valor de B: %d\n", B);

        scanf.close();

    }


    /*
    2.2 Escreva um programa que leia um número inteiro e exiba o seu módulo.
    O módulo de um número x é:
    x, se x é maior ou igual a zero.
    x * (-1), se x é menor que zero.
     */

    public static void q12() {
        Scanner scanf = new Scanner(System.in);
        int num1;

        System.out.println("Digite um valor:");
        num1 = scanf.nextInt();

        if (num1 >= 0) {
            System.out.printf("O modulo de %d eh: |%d|\n", num1, num1);
        } else {
            System.out.printf("Numero com modulo: |%d|\n", num1 * (-1));
        }

        scanf.close();

    }


    /*
    2.3 Escreva um programa que leia 5 números inteiros e imprima na tela os valores em ordem crescente e decrescente.
     */

    public static void q13() {
        Scanner scanf = new Scanner(System.in);
        int i;

        int[] valores = new int[5];

        System.out.println("Digite os numeros:");
        for (i = 0; i < 5; i++) {
            valores[i] = scanf.nextInt();
        }
        for (i = 0; i < 5; i++) {
            System.out.printf("Numeros na ordem crescente: %d\n", valores[i]);
        }

        System.out.println();

        for (i = 4; i >= 0; i--) {
            System.out.printf("Numeros na ordem decrescente: %d\n", valores[i]);
        }
        scanf.close();
    }


    /*
    2.4 Escreva um programa que leia dois números e apresente a diferença do maior para o menor.
     */

    public static void q14() {
        Scanner scanf = new Scanner(System.in);

        int num1, num2, diferenca;

        System.out.println("Digite o primeiro numero:");
        num1 = scanf.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = scanf.nextInt();

        if (num1 > num2) {
            diferenca = num1 - num2;
        } else {
            diferenca = num2 - num1;
        }
        System.out.printf("A diferenca entre os dois numeros eh: %d\n", diferenca);

        scanf.close();
    }

    /*
    2.5 Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi aprovado se o valor da média escolar for maior ou igual a 7.
    Se o valor da média for menor que 7, solicitar a nota do recuperação, somar com o valor da média e obter a nova média.
    Se a nova média for maior ou igual a 7, apresentar uma mensagem informando que o aluno foi aprovado na recuperação.
    Se o aluno não foi aprovado, apresentar uma mensagem informando a condição de reprovado.
    Apresentar junto com as mensagens o valor da média do aluno.
     */

    public static void q15() {
        Scanner scanf = new Scanner(System.in);

        double num1, num2, num3, num4, rec, media, novaMedia;

        System.out.println("Informe a primeira nota:");
        num1 = scanf.nextDouble();

        System.out.println("Informe a segunda nota:");
        num2 = scanf.nextDouble();

        System.out.println("Informe a terceira nota:");
        num3 = scanf.nextDouble();

        System.out.println("Informe a quarta nota:");
        num4 = scanf.nextDouble();

        media = (num1 + num2 + num3 + num4) / 4;

        if (media >= 7) {
            System.out.printf("Voce foi aprovado com sucesso! sua media foi de: %.2f\n", media);
        } else {
            System.out.println("Voce esta em recuperacao, sua media foi de: " + media);
            System.out.println("Digite a nota da recuperacao: ");
            rec = scanf.nextDouble();

            novaMedia = (media + rec) / 2;

            if (novaMedia >= 7) {
                System.out.printf("Aluno foi aprovado na recuperacao, com media: %.2f\n", novaMedia);
            } else {
                System.out.printf("Aluno foi reprovado com media: %.2f\n", novaMedia);
            }
        }
        scanf.close();
    }


    /*
    2.6 Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do menor número.
    Se os dois números forem iguais, o programa deve exibir mensagem informando este fato.
     */

    public static void q16() {
        Scanner scanf = new Scanner(System.in);

        double num1, num2;

        System.out.println("Digite o primeiro valor:");
        num1 = scanf.nextDouble();

        System.out.println("Digite o segundo valor:");
        num2 = scanf.nextDouble();

        if (num1 > num2) {
            System.out.printf("O maior valor eh: %.2f e o menor valor eh %.2f", num1, num2);
        } else if (num2 > num1) {
            System.out.printf("O maior valor eh %.2f e o menor valor %.2f", num2, num1);
        } else {
            System.out.println("Os valores sao iguais.");
        }
        scanf.close();
    }


    /*
    2.7 Escreva um programa que leia um número inteiro. Verificar por meio de condição se o valor fornecido está na faixa entre 0 (zero) e 9 (nove).
    Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor válido”.
    Caso contrário, apresentar a mensagem “valor inválido”, em qualquer outro caso, informe "erro".
     */


    public static void q17() {
        Scanner scanf = new Scanner(System.in);

        int num1;

        System.out.println("Digite um numero:");
        num1 = scanf.nextInt();

        if (num1 >= 0 && num1 <= 9) {
            System.out.println("Valor valido.");
        } else {
            System.out.println("Valor invalido.");
        }

        scanf.close();
    }


    /*
    2.8 Escreva um programa que leia um número inteiro (variável CÓDIGO).
    Verificar se o código é igual a 1, igual a 2 ou igual a 3.
    Caso não seja, apresentar a mensagem “Código inválido”.
    Ao ser verificado o código e constatado que é um valor válido,
    o programa deve verificar cada código em separado para determinar seu valor por extenso, ou seja,
    apresentar a mensagem “um”, ”dois” ou “três”. (Utilizar o comando Switch).
     */


    public static void q18() {
        Scanner scanf = new Scanner(System.in);

        int cod;

        System.out.println("Digite um numero inteiro:");
        cod = scanf.nextInt();

        switch (cod) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Tres");
                break;
            default:
                System.out.println("Numero invalido.");
                break;
        }
        scanf.close();
    }


    /*
    2.9 Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C).
    Verificar se cada lado é menor que a soma dos outros dois lados.
    Se sim, saber de A==B e se B==C, sendo verdade o triângulo é equilátero;
    Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso contrário, o triângulo será escaleno.
    Caso os lados fornecidos não caracterizarem um triângulo, avisar a ocorrência.
     */

    public static void q19() {
        Scanner scanf = new Scanner(System.in);

        double A, B, C;

        System.out.println("Digite o valor de A:");
        A = scanf.nextDouble();

        System.out.println("Digite o valor de B:");
        B = scanf.nextDouble();

        System.out.println("Digite o valor de C:");
        C = scanf.nextDouble();

        if (A < B + C && B < A + C && C < A + B) {
            System.out.println("Pode ser um triangulo.");

            if (A == B && B == C) {
                System.out.println("eh um triangulo equilatero");
            } else if (A == B || A == C || B == C) {
                System.out.println("eh um triangulo isosceles");
            } else {
                System.out.println("eh um triangulo escaleno");
            }

        } else {
            System.out.println("Os valores nao formam um triangulo!");
        }

        scanf.close();
    }


    /*
    2.10 Escrever um programa declarando três variáveis do tipo inteiro (a, b e c).
         Ler um valor maior que zero para cada variável (se o valor digitado não é válido, mostrar mensagem e ler novamente).
         Exibe o menor valor lido multiplicado pelo maior e o maior valor dividido pelo menor.
    */

    public static void q20() {
        Scanner scanf = new Scanner(System.in);

        int a, b, c;

        do {
            System.out.println("Digite o primeiro valor(maior que 0):");
            a = scanf.nextInt();
            if (a <= 0) {
                System.out.println("Valor invalido.");
            }
        } while (a <= 0);

        do {
            System.out.println("Digite o segundo valor(maior que 0):");
            b = scanf.nextInt();
            if (b <= 0) {
                System.out.println("Valor invalido.");
            }
        } while (b <= 0);

        do {
            System.out.println("Digite o terceiro valor(maior que 0):");
            c = scanf.nextInt();
            if (c <= 0) {
                System.out.println("Valor invalido.");
            }
        } while (c <= 0);

        int maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;

        int menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;

        System.out.printf("Menor valor: %d x Maior valor: %d = %d\n", menor, maior, menor * maior);

        System.out.printf("Maior valor: %d ÷ Menor valor: %d = %.2f\n", maior, menor, (double) maior / menor);

        scanf.close();
    }


    /*
    2.11 Faça um programa que leia um número inteiro
    e mostre uma mensagem na tela indicando se este número é positivo ou negativo.
    */


    public static void q21() {
        Scanner scanf = new Scanner(System.in);

        int num1;

        System.out.println("Digite um numero inteiro:");
        num1 = scanf.nextInt();

        if (num1 > 0) {
            System.out.println("O numero e positivo.");
        } else {
            System.out.println("O numero e negativo.");
        }
        scanf.close();
    }


    /*
    Faça um programa que leia um número.
    Se positivo, armazene-o em A, se for negativo, em B.
    No final mostrar o os número em um único print.
     */

    public static void q22() {
        Scanner scanf = new Scanner(System.in);

        int num1, A = 0, B = 0;

        System.out.println("Digite um valor:");
        num1 = scanf.nextInt();

        if (num1 > 0) {
            A = num1;
        } else if (num1 < 0) {
            B = num1;
        } else {
            System.out.println("O numero eh zero.");
        }

        System.out.println("Valores armazenados: A = " + A + ", B = " + B);
        scanf.close();
    }


    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int cod;
        System.out.println("qual questao quer executar? (1 a 22)");
        cod = scanf.nextInt();

        switch (cod) {
            case 1:
                q1();
                break;
            case 2:
                q2();
                break;
            case 3:
                q3();
                break;
            case 4:
                q4();
                break;
            case 5:
                q5();
                break;
            case 6:
                q6();
                break;
            case 7:
                q7();
                break;
            case 8:
                q8();
                break;
            case 9:
                q9();
                break;
            case 10:
                q10();
                break;
            case 11:
                q11();
                break;
            case 12:
                q12();
                break;
            case 13:
                q13();
                break;
            case 14:
                q14();
                break;
            case 15:
                q15();
                break;
            case 16:
                q16();
                break;
            case 17:
                q17();
                break;
            case 18:
                q18();
                break;
            case 19:
                q19();
                break;
            case 20:
                q20();
                break;
            case 21:
                q21();
                break;
            case 22:
                q22();
                break;
            default:
                System.out.println("nao existe uma questao com esse numero.");
                break;
        }
        scanf.close();
    }
}