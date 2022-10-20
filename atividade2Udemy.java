import java.util.*;

public class atividade2Udemy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois números para o X e Y: ");
        double valorX = sc.nextDouble();
        double valorY = sc.nextDouble();
        while (valorX != 0 & valorY != 0) {
            if (valorX > 0 & valorY > 0) {
                System.out.println("Esses valores se encontram no PRIMEIRO quadrante no plano cartesiano. ");
            } else if (valorX < 0 & valorY < 0) {
                System.out.println("Esses valores se encontram no TERCEIRO quadrante no plano cartesiano.");
            } else if (valorX < 0 & valorY > 0) {
                System.out.println("Esses valores se encontram no SEGUNDO quadrante no plano cartesiano.");
            } else {
                System.out.println("Esses valores se encontram no QUARTO quadrante no plano cartesiano.");
            }
            System.out.println("Valor de X: ");
            valorX = sc.nextDouble();
            System.out.println("Valor de Y: ");
            valorY = sc.nextDouble();
        }
    }
}
