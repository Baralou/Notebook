import java.util.*;

public class estruturaForAtividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor");
        int x = sc.nextInt();
        for (int i = 1; i < x; i++){
            if(i % 2 !=0){
                System.out.println(i);
            }
        }
    }
}
