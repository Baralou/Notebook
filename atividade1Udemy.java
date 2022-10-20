import java.util.*;
public class atividade1Udemy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua senha: ");
        int senhaInserida = sc.nextInt();
        while(senhaInserida != 2002){
            System.out.println("Senha Inválida!");
            System.out.println("Tente novamente: ");
            senhaInserida = sc.nextInt();
        }
        System.out.println("Acesso permitido! ");
    }
}
