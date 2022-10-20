import java.util.*;

public class atividade3Udemy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, diesel = 0, alcool = 0, gasolina = 0;
        System.out.println("Com qual tipo de combustível você gostaria de abastecer? \n1.Álcool\n2.Gasolina.\n3.Diesel.\n4.Fim.");
        numero = sc.nextInt();
        while (numero != 4) {
            System.out.println("Com qual tipo de combustível você gostaria de abastecer? \n1.Álcool\n2.Gasolina.\n3.Diesel.\n4.Fim.");
            numero = sc.nextInt();
            if (numero == 1) {
                alcool += 1;
            } else if (numero == 2) {
                gasolina += 1;
            } else if (numero == 3) {
                diesel += 1;
            } else {
                System.out.println("Muito Obrigada!\n");
            }
        }
        System.out.printf("Álcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina,diesel);
    }
}