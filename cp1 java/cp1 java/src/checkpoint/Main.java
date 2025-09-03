package checkpoint;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Chame aqui o exercício que deseja rodar =====
        exercicio5(sc);
        // exemplo: para testar outro, comente o de cima e descomente:
        // exercicio4(sc);

        sc.close();
    }

    // 1) Converter metros em cm e mm
    public static void exercicio1(Scanner sc) {
        System.out.print("Digite o valor em metros: ");
        double metros = sc.nextDouble();
        System.out.println("Centímetros: " + (metros * 100));
        System.out.println("Milímetros: " + (metros * 1000));
    }

    // 2) Verifica se pode votar
    public static void exercicio2(Scanner sc) {
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        if (idade >= 16) {
            System.out.println("Pode votar!");
        } else {
            System.out.println("Não pode votar!");
        }
    }


    // 3) Mostrar todos os números entre dois valores
    public static void exercicio3(Scanner sc) {
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        for (int i = Math.min(a, b) + 1; i < Math.max(a, b); i++) {
            System.out.print(i + " ");
        }
    }

    // 4) Fatorial
    public static void exercicio4(Scanner sc) {
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        System.out.println("Fatorial: " + fatorial(n));
    }

    public static long fatorial(int n) {
        long fat = 1;
        for (int i = 2; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    // 5) Contar pares e ímpares
    public static void exercicio5(Scanner sc) {
        int pares = 0, impares = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int n = sc.nextInt();
            if (n % 2 == 0) pares++;
            else impares++;
        }
        System.out.println("Pares: " + pares + ", Ímpares: " + impares);
    }

    // 6) Tabuada
    public static void exercicio6(Scanner sc) {
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // 7) Retornar o maior de dois números
    public static void exercicio7(Scanner sc) {
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        System.out.println("Maior: " + Math.max(a, b));
    }

    // 8) IMC
    public static void exercicio8(Scanner sc) {
        System.out.print("Digite a altura (m): ");
        double altura = sc.nextDouble();
        System.out.print("Digite o peso (kg): ");
        double peso = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);
        if (imc < 18.5) System.out.println("Abaixo do peso");
        else if (imc < 25) System.out.println("Peso normal");
        else if (imc < 30) System.out.println("Sobrepeso");
        else System.out.println("Obesidade");
    }

    // 9) Média de 3 números
    public static void exercicio9(Scanner sc) {
        System.out.print("Digite três números: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.println("Média: " + ((a + b + c) / 3));
    }

    // 10) Valor final do produto
    public static void exercicio10(Scanner sc) {
        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();
        System.out.print("Forma de pagamento (1=à vista, 2=2x, 3=4x): ");
        int op = sc.nextInt();

        switch (op) {
            case 1 -> System.out.println("Total: R$" + (preco * 0.9));
            case 2 -> System.out.println("2x de R$" + (preco / 2));
            case 3 -> System.out.println("4x de R$" + (preco * 1.08 / 4));
            default -> System.out.println("Opção inválida!");
        }
    }

    // 11) Pessoa mais velha
    public static void exercicio11(Scanner sc) {
        String nomeMaisVelho = "";
        int idadeMaisVelho = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Nome da pessoa " + i + ": ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
                nomeMaisVelho = nome;
            }
        }
        System.out.println("Mais velho: " + nomeMaisVelho + " (" + idadeMaisVelho + ")");
    }

    // 12) Volume da caixa
    public static void exercicio12(Scanner sc) {
        System.out.print("Altura: ");
        double h = sc.nextDouble();
        System.out.print("Comprimento: ");
        double c = sc.nextDouble();
        System.out.print("Largura: ");
        double l = sc.nextDouble();
        System.out.println("Volume: " + (h * c * l));
    }

    // 13) Classe Car
    static class Car {
        String brand;
        String model;
        int year;

        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public void exibir() {
            System.out.println(year + " " + brand + " " + model);
        }
    }

    public static void exercicio13() {
        Car c1 = new Car("Toyota", "Corolla", 2020);
        Car c2 = new Car("Honda", "Civic", 2022);
        c1.exibir();
        c2.exibir();
    }

    // 14) Fahrenheit para Celsius
    public static void exercicio14(Scanner sc) {
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("Celsius: " + c);
    }

    // 15) Contagem regressiva
    public static void exercicio15(Scanner sc) {
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
