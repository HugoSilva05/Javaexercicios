import java.util.*;

public class Soma {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("Informe o terceiro número: ");
        int n3 = sc.nextInt();
        
        // Primeiro maior que segundo, segundo maior que terceiro
        if ((n1>n2) && (n2>n3)){
            int total = n1 + n2;
            System.out.println("O total é " + total);
        }
        //Segundo maior que primeiro, primeiro maior que terceiro
        if ((n2>n1) && (n1>n3)){
            int total = n1 + n2;
            System.out.println("O total é " + total);
        }
        //Segundo maior que terceiro, terceiro maior que primeiro
        if ((n2>n3) && (n3>n1)){
            int total = n2 + n3;
            System.out.println("O total é " + total);
        }
        //Terceiro maior que segundo, segundo maior que primeiro
        if ((n3>n2) && (n2>n1)){
            int total = n2 + n3;
            System.out.println("O total é " + total);
        }
        //Terceiro maior que primeiro, primeiro maior que segundo
        if ((n3>n1) && (n1>n2)){
            int total = n1 + n3;
            System.out.println("O total é " + total);
        }
        //Primeiro maior que terceiro, terceiro maior que segundo
        if ((n1>n3) && (n3>n2)){
            int total = n1 + n3;
            System.out.println("O total é " + total);
        }
    }
}