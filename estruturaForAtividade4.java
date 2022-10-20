import java.util.*;

public class estruturaForAtividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a quantidade de pares ");
        int repeticoes = sc.nextInt();

        for (int i = 0; i < repeticoes; i++) {
            System.out.println("Escolha o numerador: ");
            double numerador = sc.nextInt();
            System.out.println("Escolha o denominador: ");
            double denominador = sc.nextInt();

            if (denominador == 0) {
                System.out.println("Divisão impossível!\n");
            } else {
                double resolucao = numerador / denominador;
                System.out.printf("%,.0f / %,.0f = %,.1f\n", numerador, denominador, resolucao);
            }
        }
    }
}