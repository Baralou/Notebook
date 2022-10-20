import java.util.*;
public class estruturaForAtividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("quantas vezes você quer repetir o programa?");
        int valorN = sc.nextInt();
        double  valor1,valor2,valor3;
        for(int i = 0; i < valorN; i++){
            System.out.println("Insira 3 valores reais: ");
            valor1 = sc.nextDouble();
            valor2 = sc.nextDouble();
            valor3 = sc.nextDouble();

            double mediaPonderadaValor1 = (valor1 * 2);
            double mediaPonderadaValor2 = (valor2 * 3);
            double mediaPonderadaValor3 = (valor3 * 5);

            double totalMedias = (mediaPonderadaValor1 + mediaPonderadaValor2 + mediaPonderadaValor3)/ (2+3+5);
            System.out.printf("A média ponderada dos valores é: %,.2f\n",totalMedias);
        }
    }
}
