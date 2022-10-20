import java.util.*;

public class estruturaForAtividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = 0;
        int out = 0;

        System.out.println("Insira quantos vezes você quer repetir: ");
        int n = sc.nextInt();
        System.out.println("Valores:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x >= 10 & x <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}