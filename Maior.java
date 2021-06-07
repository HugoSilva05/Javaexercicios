import java.util.*;

public class Maior {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("Informe o terceiro número: ");
        int n3 = sc.nextInt();

        if ((n1>n2) && (n1>n3)){
            System.out.println("O primeiro número é o maior");
        }
        if ((n2>n1) && (n2>n3)){
            System.out.println("O segundo número é o maior");
        }
        if ((n3>n1) && (n3>n2)){
            System.out.println("O primeiro número é o maior");
        }
    }
}