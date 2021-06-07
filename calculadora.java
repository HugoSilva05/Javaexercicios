import java.util.*;
public class calculadora {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        double n1 = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        double n2 = sc.nextInt();
        
        System.out.println("Informe a operação desejada: \n1 = Soma \n2 = Subtração \n3 = Multiplicação \n4 = Divisão");
        int calculo = sc.nextInt();

            double total = 0;
        switch (calculo) {
            case 1:
                total = n1 + n2;
              System.out.println("Total = "+ total);
              break;
            case 2:
                total = n1 - n2;
              System.out.println("Total = "+ total);
              break;
            case 3:
                total = n1 * n2;
              System.out.println("Total = "+ total);
              break;
            case 4:
                total = n1 / n2;
              System.out.println("Total = "+ total);
              break;
        }
    }
}
