import java.util.*;
public class verdadeiro {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.println("Escreva o segundo número: ");
        int n2 = sc.nextInt();

        if ((n1>0) && (n2>0)){
            System.out.println("Verdadeiro");
        }
        else if ((n1<0) && (n2<0)){
            System.out.println("Falso");
        }
        else{
            System.out.println("Eu num do conta");
        }
    }
}
