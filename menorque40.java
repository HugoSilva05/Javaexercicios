import java.util.*;
public class menorque40 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int soma = 0;

        while(contador<=10){
            System.out.println("Digite um número: ");
            int n = sc.nextInt();

            if (n<40){
                soma = n + soma;
            }

            contador = contador + 1;
        }
        System.out.println("A soma é de: " + soma);
    }
}