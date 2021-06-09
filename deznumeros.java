import java.util.*;
public class deznumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int soma = 0;
        while(contador<=10){
            System.out.println("Digite um número: ");
            soma = sc.nextInt() + soma;
            contador = contador + 1;
        }
        System.out.println("O Total da soma é: "+ soma);
    }
}
